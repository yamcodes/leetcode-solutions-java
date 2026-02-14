package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

/** Shared test cases for all solutions to the Minimum Deletions problem. */
@SuppressWarnings("unused") // Referenced via @MethodSource strings
public class TestCases {
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
}
