package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

/**
 * <p>Solution for the <b>Minimum Deletions to Make String Balanced</b> problem.</p>
 * <ul>
 * <li><b>Time Complexity:</b> <code>O(n)</code></li>
 * <li><b>Space Complexity:</b> <code>O(n)</code></li>
 * </ul>
 */
class Solution {
  /**
   * Counts misplaced characters around the given split point in {@code s}.
   *
   * <ul>
   *   <li><b>Time Complexity:</b> <code>O(n)</code>
   *   <li><b>Space Complexity:</b> <code>O(1)</code>
   * </ul>
   *
   * @param s the string of {@code 'a'} and {@code 'b'} characters
   * @param index the split point index
   * @return an array {@code [bCount, aCount]} where {@code bCount} is the number of {@code 'b'}s
   *     before {@code index} and {@code aCount} is the number of {@code 'a'}s after {@code index}
   */
  @SuppressWarnings("unused")
  int[] getSliceInfo(String s, int index) {
    int aCount = 0, bCount = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == 'b' && i < index) {
        bCount++;
      }
      if (c == 'a' && i > index) {
        aCount++;
      }
    }
    return new int[] {bCount, aCount};
  }

  /**
   * Returns the minimum number of deletions to make {@code s} balanced, where balanced means no
   * {@code 'b'} appears before an {@code 'a'}. Tries every split point and uses {@link
   * #getSliceInfo(String, int)} to count misplaced characters at each.
   *
   * <ul>
   *   <li><b>Time Complexity:</b> <code>O(n²)</code>
   *   <li><b>Space Complexity:</b> <code>O(1)</code>
   * </ul>
   *
   * @param s the string of {@code 'a'} and {@code 'b'} characters
   * @return the minimum number of deletions needed
   */
  @SuppressWarnings("unused")
  int minimumDeletionsNaive(String s) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < s.length(); i++) {
      int[] info = getSliceInfo(s, i);
      int computed = info[0] + info[1];
      min = Math.min(min, computed);
    }
    return min;
  }

  /**
   * Returns the minimum number of deletions to make {@code s} balanced, where balanced means no
   * {@code 'b'} appears before an {@code 'a'}. Uses prefix/suffix counting to find the optimal
   * split point in linear time.
   *
   * <ul>
   *   <li><b>Time Complexity:</b> <code>O(n)</code>
   *   <li><b>Space Complexity:</b> <code>O(n)</code>
   * </ul>
   *
   * @param s the string of {@code 'a'} and {@code 'b'} characters
   * @return the minimum number of deletions needed
   */
  int minimumDeletions(String s) {
    var aCountList = new int[s.length()];
    var bCountList = new int[s.length()];
    int aCount = 0;
    int bCount = 0;
    int n = s.length();
    int min = n; // we never need more than n deletions

    // count a's
    for (int i = n - 1; i >= 0; i--) {
      aCountList[i] = aCount;
      if (s.charAt(i) == 'a') {
        aCount++;
      }
    }

    // count b's
    for (int i = 0; i < n; i++) {
      bCountList[i] = bCount;
      if (s.charAt(i) == 'b') {
        bCount++;
      }
    }

    // calculate minimum
    for (int i = 0; i < n; i++) {
      min = Math.min(min, aCountList[i] + bCountList[i]);
    }

    return min;
  }
}
