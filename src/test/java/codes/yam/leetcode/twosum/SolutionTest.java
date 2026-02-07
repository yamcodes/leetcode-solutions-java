package codes.yam.leetcode.twosum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.Arrays;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {
  static Stream<Arguments> cases() {
    return Stream.of(
        arguments(new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}),
        arguments(new int[] {3, 2, 4}, 6, new int[] {1, 2}),
        arguments(new int[] {3, 3}, 6, new int[] {0, 1}),
        arguments(new int[] {-1, -2, -3, -4, -5}, -8, new int[] {2, 4}));
  }

  @ParameterizedTest
  @MethodSource("cases")
  void twoSum(int[] nums, int target, int[] expected) {
    int[] result = new Solution().twoSum(nums, target);
    Arrays.sort(result);
    Arrays.sort(expected);
    assertArrayEquals(expected, result);
  }
}
