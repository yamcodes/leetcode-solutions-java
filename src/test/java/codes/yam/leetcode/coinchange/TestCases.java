package codes.yam.leetcode.coinchange;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

@SuppressWarnings("unused")
class TestCases {
  static Stream<Arguments> cases() {
    return Stream.of(
        Arguments.of(new int[] {1, 2, 5}, 11, 3),
        Arguments.of(new int[] {2}, 3, -1),
        Arguments.of(new int[] {1}, 0, 0));
  }
}
