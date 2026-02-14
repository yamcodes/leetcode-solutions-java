package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Disabled("Not yet implemented")
class SolutionMemoizedTest {
  @ParameterizedTest
  @MethodSource("codes.yam.leetcode.minimumdeletionstomakestringbalanced.TestCases#cases")
  void minimumDeletions(String s, int expected) {
    assertEquals(expected, new SolutionMemoized().minimumDeletions(s));
  }
}
