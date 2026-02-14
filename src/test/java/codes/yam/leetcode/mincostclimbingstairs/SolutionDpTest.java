package codes.yam.leetcode.mincostclimbingstairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionDpTest {
  @ParameterizedTest
  @MethodSource("codes.yam.leetcode.mincostclimbingstairs.TestCases#cases")
  void minCostClimbingStairs(int[] cost, int expected) {
    assertEquals(expected, new SolutionDp().minCostClimbingStairs(cost));
  }
}
