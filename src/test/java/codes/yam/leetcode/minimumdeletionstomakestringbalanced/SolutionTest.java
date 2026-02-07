package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {
  static Stream<Arguments> cases() {
    return Stream.of(
        arguments("aababbab", 2),
        arguments("bbaaaaabb", 2));
  }

  @ParameterizedTest
  @MethodSource("cases")
  void minimumDeletions(String s, int expected) {
    assertEquals(expected, new Solution().minimumDeletions(s));
  }
}
