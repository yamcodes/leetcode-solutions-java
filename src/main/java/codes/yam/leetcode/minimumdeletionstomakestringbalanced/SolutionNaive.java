package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

/**
 * Naive solution for the <b>Minimum Deletions to Make String Balanced</b> problem.
 *
 * <p>Tries every split point and counts misplaced characters at each.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(n²)</code>
 *   <li><b>Space Complexity:</b> <code>O(1)</code>
 * </ul>
 */
class SolutionNaive {
  /**
   * Counts misplaced characters around the given split point in {@code s}.
   *
   * @param s the string of {@code 'a'} and {@code 'b'} characters
   * @param index the split point index
   * @return an array {@code [bCount, aCount]} where {@code bCount} is the number of {@code 'b'}s
   *     before {@code index} and {@code aCount} is the number of {@code 'a'}s after {@code index}
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
    return new int[] {bCount, aCount};
  }

  /**
   * Returns the minimum number of deletions to make {@code s} balanced.
   *
   * @param s the string of {@code 'a'} and {@code 'b'} characters
   * @return the minimum number of deletions needed
   */
  int minimumDeletions(String s) {
    int n = s.length();
    int min = n;
    for (int i = 0; i < n; i++) {
      int[] info = getSliceInfo(s, i);
      int computed = info[0] + info[1];
      min = Math.min(min, computed);
    }
    return min;
  }
}
