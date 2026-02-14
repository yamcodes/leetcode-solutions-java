package codes.yam.leetcode.mincostclimbingstairs;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

@SuppressWarnings("unused")
class TestCases {
  static Stream<Arguments> cases() {
    return Stream.of(
        Arguments.of(new int[] {10, 15, 20}, 15),
        Arguments.of(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}, 6));
  }
}
