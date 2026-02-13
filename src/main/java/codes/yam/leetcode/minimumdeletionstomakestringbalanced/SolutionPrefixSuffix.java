package codes.yam.leetcode.minimumdeletionstomakestringbalanced;

/**
 * Prefix/suffix solution for the <b>Minimum Deletions to Make String Balanced</b> problem.
 *
 * <p>Pre-computes prefix {@code 'b'} counts and suffix {@code 'a'} counts, then finds the optimal
 * split point in a single pass.
 *
 * <ul>
 *   <li><b>Time Complexity:</b> <code>O(n)</code>
 *   <li><b>Space Complexity:</b> <code>O(n)</code>
 * </ul>
 */
class SolutionPrefixSuffix {
  /**
   * Returns the minimum number of deletions to make {@code s} balanced.
   *
   * @param s the string of {@code 'a'} and {@code 'b'} characters
   * @return the minimum number of deletions needed
   */
  int minimumDeletions(String s) {
    var aCountList = new int[s.length()];
    var bCountList = new int[s.length()];
    int aCount = 0;
    int bCount = 0;
    int n = s.length();
    int min = n;

    // count a's from right to left
    for (int i = n - 1; i >= 0; i--) {
      aCountList[i] = aCount;
      if (s.charAt(i) == 'a') {
        aCount++;
      }
    }

    // count b's from left to right
    for (int i = 0; i < n; i++) {
      bCountList[i] = bCount;
      if (s.charAt(i) == 'b') {
        bCount++;
      }
    }

    // calculate minimum
    for (int i = 0; i < n; i++) {
      min = Math.min(min, aCountList[i] + bCountList[i]);
    }

    return min;
  }
}
