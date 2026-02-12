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
        arguments("bbaaaaabb", 2),
        arguments("b", 0),
        arguments("ba", 1),
        arguments("aabbbaa", 2),
        arguments("abababab", 3),
        arguments("bbbbaaaa", 4));
  }

  @ParameterizedTest
  @MethodSource("cases")
  void recursiveSolution(String s, int expected) {
    assertEquals(expected, new RecursiveSolution().minimumDeletions(s));
  }

  @ParameterizedTest
  @MethodSource("cases")
  void memoizedSolution(String s, int expected) {
    assertEquals(expected, new MemoizedSolution().minimumDeletions(s));
  }

  @ParameterizedTest
  @MethodSource("cases")
  void dpSolution(String s, int expected) {
    assertEquals(expected, new DpSolution().minimumDeletions(s));
  }

  @ParameterizedTest
  @MethodSource("cases")
  void solution(String s, int expected) {
    assertEquals(expected, new Solution().minimumDeletions(s));
  }
}
