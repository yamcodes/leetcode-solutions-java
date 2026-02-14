package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

/**
 * Solution for the <b>Minimum Deletions to Make String Balanced</b> problem.
 *
 * <p>Optimizes {@code SolutionDp} by collapsing the DP table into constant space.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(n)</code>
 *   <li><b>Space Complexity:</b> <code>O(1)</code>
 * </ul>
 */
class Solution {
  /**
   * Returns the minimum number of deletions to make {@code s} balanced.
   *
   * @param s the string of {@code 'a'} and {@code 'b'} characters
   * @return the minimum number of deletions needed
   */
  @SuppressWarnings("unused")
  int minimumDeletions(String s) {
    int n = s.length();
    int aAfter = 0, j = 0, bBefore = 0, bBeforeRun = 0;
    for (int i = 0; i < n; i++) {
      char letter = s.charAt(i);
      if (letter == 'a') aAfter++;
      else bBeforeRun++;
      if (aAfter + bBefore > bBeforeRun) {
        bBefore = bBeforeRun;
        aAfter = 0;
      }
    }
    return Math.min(bBeforeRun, aAfter + bBefore);
  }
}
