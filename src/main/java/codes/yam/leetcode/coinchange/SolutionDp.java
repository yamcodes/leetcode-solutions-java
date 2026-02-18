package codes.yam.leetcode.coinchange;

import java.util.Arrays;

class SolutionDp {
  int coinChange(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, 1, amount + 1, amount + 1);
    for (int a = 1; a <= amount; a++) {
      for (int c : coins) {
        if (c <= a) {
          dp[a] = Math.min(dp[a], 1 + dp[a - c]);
        }
      }
    }
    if (dp[amount] > amount) {
      return -1;
    }
    return dp[amount];
  }
}
