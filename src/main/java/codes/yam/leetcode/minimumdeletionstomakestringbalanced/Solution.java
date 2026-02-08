package codes.yam.leetcode.minimumdeletionstomakestringbalanced;


class Solution {
  /**
   * <p>Counts misplaced characters around the given split point in {@code s}.</p>
   * <ul>
   * <li><b>Time Complexity:</b> <code>O(n)</code></li>
   * <li><b>Space Complexity:</b> <code>O(1)</code></li>
   * </ul>
   *
   * @param s     the string of {@code 'a'} and {@code 'b'} characters
   * @param index the split point index
   * @return an array {@code [bCount, aCount]} where {@code bCount} is the number of
   *         {@code 'b'}s before {@code index} and {@code aCount} is the number of
   *         {@code 'a'}s after {@code index}
   */
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
    return new int[]{bCount, aCount};
  }

  /**
   * <p>Returns the minimum number of deletions to make {@code s} balanced, where balanced
   * means no {@code 'b'} appears before an {@code 'a'}. Tries every split point and uses
   * {@link #getSliceInfo(String, int)} to count misplaced characters at each.</p>
   * <ul>
   * <li><b>Time Complexity:</b> <code>O(n²)</code></li>
   * <li><b>Space Complexity:</b> <code>O(1)</code></li>
   * </ul>
   *
   * @param s the string of {@code 'a'} and {@code 'b'} characters
   * @return the minimum number of deletions needed
   */
  int minimumDeletions(String s) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < s.length(); i++) {
      int[] info = getSliceInfo(s, i);
      int computed = info[0] + info[1];
      min = Math.min(min, computed);
    }
    return min;
  }
}
