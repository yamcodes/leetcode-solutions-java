package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

/**
 * Bottom-up DP solution for the <b>Minimum Deletions to Make String Balanced</b> problem.
 *
 * <p>Iterative DP table tracking minimum deletions at each position.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(n)</code>
 *   <li><b>Space Complexity:</b> <code>O(n)</code>
 * </ul>
 */
class SolutionDp {
  /**
   * Returns the minimum number of deletions to make {@code s} balanced.
   *
   * @param s the string of {@code 'a'} and {@code 'b'} characters
   * @return the minimum number of deletions needed
   */
  int minimumDeletions(String s) {
    int n = s.length();
    int[] dp = new int[n];
    int bCount = s.charAt(0) == 'b' ? 1 : 0;
    for (int i = 1; i < n; i++) {
      if (s.charAt(i) == 'b') {
        dp[i] = dp[i - 1];
        bCount++;
      } else {
        dp[i] = Math.min(dp[i - 1] + 1, bCount);
      }
    }
    return dp[n - 1];
  }
}
