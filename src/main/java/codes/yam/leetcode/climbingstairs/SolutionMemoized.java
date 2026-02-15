package codes.yam.leetcode.climbingstairs;

/**
 * Solution for the <b>Climbing Stairs</b> problem.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(n)</code>
 *   <li><b>Space Complexity:</b> <code>O(n)</code>
 * </ul>
 */
class SolutionMemoized {
  int[] memo;

  /**
   * Recursively computes the number of ways to climb {@code n} steps with memoization.
   *
   * @param n the number of remaining steps
   * @return the number of distinct ways to reach step {@code n}
   */
  int rec(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;
    if (memo[n] == 0) {
      memo[n] = rec(n - 1) + rec(n - 2);
    }
    return memo[n];
  }

  /**
   * Returns the number of distinct ways to climb to the top.
   *
   * @param n the number of steps
   * @return the number of distinct ways to reach step {@code n}
   */
  int climbStairs(int n) {
    memo = new int[n + 1];
    return rec(n);
  }
}
