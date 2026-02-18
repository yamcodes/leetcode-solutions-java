package codes.yam.leetcode.coinchange;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionDpNaiveTest {
  @ParameterizedTest
  @MethodSource("codes.yam.leetcode.coinchange.TestCases#cases")
  void coinChange(int[] coins, int amount, int expected) {
    assertEquals(expected, new SolutionDpNaive().coinChange(coins, amount));
  }
}
