/**
 * Solutions for the "Minimum Deletions to Make String Balanced" problem on LeetCode.
 *
 * <ul>
 *   <li><b>Slug:</b> <code>minimum-deletions-to-make-string-balanced</code>
 *   <li><b>Difficulty:</b> Medium
 * </ul>
 *
 * <p><b>Solution progression:</b>
 *
 * <ol>
 *   <li>{@link NaiveSolution} — Brute force, <code>O(n²)</code> time, <code>O(1)</code> space
 *   <li>{@link PrefixSuffixSolution} — Prefix/suffix arrays, <code>O(n)</code> time, <code>O(n)
 *       </code> space
 *   <li>{@link Solution} — Single-pass DP, <code>O(n)</code> time, <code>O(1)</code> space
 * </ol>
 *
 * @see <a href="https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/">Problem
 *     Link</a>
 */
package codes.yam.leetcode.minimumdeletionstomakestringbalanced;
