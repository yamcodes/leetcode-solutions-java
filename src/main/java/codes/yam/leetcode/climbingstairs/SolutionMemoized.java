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
  int rec(int n) {
    int[] memo = new int[n + 1];
    memo[1] = 1;
    memo[2] = 2;
    if (memo[n - 1] == 0) memo[n - 1] = rec(n - 1);
    if (memo[n - 2] == 0) memo[n - 2] = rec(n - 2);
    return memo[n - 1] + memo[n - 2];
  }

  int climbStairs(int n) {
    return rec(n);
  }
}
