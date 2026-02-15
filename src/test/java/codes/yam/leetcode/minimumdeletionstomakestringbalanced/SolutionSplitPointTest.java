package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionSplitPointTest {
  @ParameterizedTest
  @MethodSource("codes.yam.leetcode.minimumdeletionstomakestringbalanced.TestCases#cases")
  void minimumDeletions(String s, int expected) {
    assertEquals(expected, new SolutionSplitPoint().minimumDeletions(s));
  }
}
