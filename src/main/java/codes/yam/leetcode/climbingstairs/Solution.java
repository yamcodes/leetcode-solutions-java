package codes.yam.leetcode.climbingstairs;

/**
 * Solution for the <b>Climbing Stairs</b> problem.
 *
 * <p>Optimizes {@code SolutionDp} by replacing the DP array with two rolling variables.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(n)</code>
 *   <li><b>Space Complexity:</b> <code>O(1)</code>
 * </ul>
 */
class Solution {
  int climbStairs(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;
    int a = 1;
    int b = 2;
    int c = a + b;
    for (int i = 3; i <= n; i++) {
      c = a + b;
      a = b;
      b = c;
    }
    return c;
  }
}
