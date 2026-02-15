package codes.yam.leetcode.mincostclimbingstairs;

/**
 * Solution for the <b>Min Cost Climbing Stairs</b> problem.
 *
 * <p>Optimizes {@code SolutionDp} by replacing the DP array with two rolling variables.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(n)</code>
 *   <li><b>Space Complexity:</b> <code>O(1)</code>
 * </ul>
 */
class Solution {
  /**
   * Returns the minimum cost to reach the top of the staircase.
   *
   * @param cost the cost of each step
   * @return the minimum cost to reach the top
   */
  int minCostClimbingStairs(int[] cost) {
    int a = 0;
    int b = 0;
    for (int i = 2; i <= cost.length; i++) {
      int c = Math.min(a + cost[i - 2], b + cost[i - 1]);
      a = b;
      b = c;
    }
    return b;
  }
}
