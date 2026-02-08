package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SolutionTest {
  static Stream<Arguments> cases() {
    return Stream.of(
        arguments("aababbab", 2),
            arguments("bbaaaaabb", 2),
            arguments("b", 0),
            arguments("ba", 1),
            arguments("aabbbaa", 3),
            arguments("abababab", 3),
            arguments("bbbbaaaa", 0));
  }

  @ParameterizedTest
  @MethodSource("cases")
  void minimumDeletions(String s, int expected) {
    assertEquals(expected, new Solution().minimumDeletions(s));
  }
}
