package codes.yam.leetcode.climbingstairs;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

@SuppressWarnings("unused")
class TestCases {
  static Stream<Arguments> cases() {
    return Stream.of(Arguments.of(2, 2), Arguments.of(3, 3));
  }
}
