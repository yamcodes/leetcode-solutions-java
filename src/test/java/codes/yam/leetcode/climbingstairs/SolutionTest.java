package codes.yam.leetcode.climbingstairs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  @ParameterizedTest
  @MethodSource("codes.yam.leetcode.climbingstairs.TestCases#cases")
  void climbStairs(int n, int expected) {
    assertEquals(expected, new Solution().climbStairs(n));
  }
}
