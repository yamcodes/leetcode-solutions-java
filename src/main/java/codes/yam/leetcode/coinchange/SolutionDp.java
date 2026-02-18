package codes.yam.leetcode.coinchange;

class SolutionDp {
  int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    for (int a = 1; a <= amount; a++) {
      int min = amount + 1;
      for (int c : coins) {
        if (c > a) continue;
        min = Math.min(min, 1 + dp[a - c]);
      }
      dp[a] = min;
    }
    return dp[amount] > amount ? -1 : dp[amount];
  }
}
