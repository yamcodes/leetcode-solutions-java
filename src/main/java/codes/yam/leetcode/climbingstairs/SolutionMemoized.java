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

  int rec(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;
    if (memo[n] == 0) {
      memo[n] = rec(n - 1) + rec(n - 2);
    }
    return memo[n];
  }

  int climbStairs(int n) {
    memo = new int[n + 1];
    return rec(n);
  }
}
