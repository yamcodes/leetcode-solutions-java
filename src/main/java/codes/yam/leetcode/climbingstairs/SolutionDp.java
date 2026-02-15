package codes.yam.leetcode.climbingstairs;

/**
 * Solution for the <b>Climbing Stairs</b> problem.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(n)</code>
 *   <li><b>Space Complexity:</b> <code>O(n)</code>
 * </ul>
 */
class SolutionDp {
  /**
   * Returns the number of distinct ways to climb to the top.
   *
   * @param n the number of steps
   * @return the number of distinct ways to reach step {@code n}
   */
  int climbStairs(int n) {
    if (n <= 2) return n;
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
  }
}
