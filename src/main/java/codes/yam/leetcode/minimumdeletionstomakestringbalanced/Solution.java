package codes.yam.leetcode.minimumdeletionstomakestringbalanced;


class Solution {
  /**
   * Counts the number of B's before and A's after the given index.
   *
   * @param s     the string
   * @param index the split point index
   * @return [B count before index, A count after index]
   */
  int[] getSliceInfo(String s, int index) {
    int aCount = 0, bCount = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == 'b' && i < index) {
        bCount++;
      }
      if (c == 'a' && i > index) {
        aCount++;
      }
    }
    return new int[]{bCount, aCount};
  }

  int minimumDeletions(String s) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < s.length(); i++) {
      int[] info = getSliceInfo(s, i);
      int computed = info[0] + info[1];
      min = Math.min(min, computed);
    }
    return min;
  }
}
