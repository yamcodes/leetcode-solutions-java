package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class SolutionTest {
  private final Solution solution = new Solution();

  @ParameterizedTest(name = "{0} first test")
  @ValueSource(strings = {"Hello", "world"})
  void testOne(final String str) {
    assertEquals(0, solution.minimumDeletions(str));
  }
}
