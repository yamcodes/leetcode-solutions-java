package codes.yam.leetcode.coinchange;

class SolutionDpNaive {
  int coinChange(int[] coins, int amount) {
    if (amount == 0) return 0;
    if (amount < 0) return -1;
    int[] dp = new int[amount + 1];
    for (int a = 1; a <= amount; a++) {
      boolean useMin = true;
      int min = Integer.MAX_VALUE;
      for (int c : coins) {
        if (c > a) continue;
        if (c == a) {
          dp[a] = 1;
          useMin = false;
          continue;
        }
        if (dp[a - c] == -1) continue;
        min = Math.min(min, 1 + dp[a - c]);
      }
      if (useMin) {
        dp[a] = min == Integer.MAX_VALUE ? -1 : min;
      }
    }
    return dp[amount];
  }
}
