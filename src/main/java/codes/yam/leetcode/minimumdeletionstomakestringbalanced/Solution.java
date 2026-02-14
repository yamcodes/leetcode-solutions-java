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
  int minimumDeletions(String s) {
    int aAfter = 0;
    int bBefore = 0;
    int bCount = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'b') {
        bCount++;
      } else {
        aAfter++;
      }
      if (aAfter + bBefore > bCount) {
        bBefore = bCount;
        aAfter = 0;
      }
    }
    return Math.min(bCount, aAfter + bBefore);
  }
}
