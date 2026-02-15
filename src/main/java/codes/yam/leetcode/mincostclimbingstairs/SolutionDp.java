package codes.yam.leetcode.mincostclimbingstairs;

/**
 * Solution for the <b>Min Cost Climbing Stairs</b> problem.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(n)</code>
 *   <li><b>Space Complexity:</b> <code>O(n)</code>
 * </ul>
 */
class SolutionDp {
  /**
   * Returns the minimum cost to reach the top of the staircase.
   *
   * @param cost the cost of each step
   * @return the minimum cost to reach the top
   */
  int minCostClimbingStairs(int[] cost) {
    int n = cost.length;
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 0;
    for (int i = 2; i <= n; i++) {
      dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
    }
    return dp[n];
  }
}
