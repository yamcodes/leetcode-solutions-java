package codes.yam.leetcode.climbingstairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Disabled("Not yet implemented")
class SolutionMemoizedTest {
  @ParameterizedTest
  @MethodSource("codes.yam.leetcode.climbingstairs.TestCases#cases")
  void climbStairs(int n, int expected) {
    assertEquals(expected, new SolutionMemoized().climbStairs(n));
  }
}
