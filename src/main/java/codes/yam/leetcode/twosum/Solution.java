package codes.yam.leetcode.twosum;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p>Solution for the <b>Two Sum</b> problem.</p>
 * <ul>
 * <li><b>Time Complexity:</b> <code>O(n log n)</code></li>
 * <li><b>Space Complexity:</b> <code>O(n)</code></li>
 * </ul>
 */
class Solution {
  int[][] buildNumsWithIndices(int[] nums) {
    int[][] res = new int[nums.length][2];
    for (int i = 0; i < nums.length; i++) {
      res[i][0] = nums[i];
      res[i][1] = i;
    }
    return res;
  }

  int[] twoSum(int[] nums, int target) {
    int[][] numsWithIndices = buildNumsWithIndices(nums);
    Arrays.sort(numsWithIndices, Comparator.comparingInt(a -> a[0]));
    int a = 0, b = numsWithIndices.length - 1;
    while (a < b) {
      int aVal = numsWithIndices[a][0],
          bVal = numsWithIndices[b][0],
          aIndex = numsWithIndices[a][1],
          bIndex = numsWithIndices[b][1];
      if (aVal + bVal == target) {
        return new int[] {aIndex, bIndex};
      } else if (aVal + bVal < target) {
        a++;
      } else {
        b--;
      }
    }
    throw new IllegalArgumentException("No solution found");
  }
}
