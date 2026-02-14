package codes.yam.leetcode.climbingstairs;

/**
 * Solution for the <b>Climbing Stairs</b> problem.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(2^n)</code>
 *   <li><b>Space Complexity:</b> <code>O(n)</code>
 * </ul>
 */
class SolutionRecursive {
  int climbStairs(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;
    return climbStairs(n - 1) + climbStairs(n - 2);
  }
}
