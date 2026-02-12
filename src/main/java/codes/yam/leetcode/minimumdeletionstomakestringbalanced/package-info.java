/**
 * Solutions for the "Minimum Deletions to Make String Balanced" problem on LeetCode.
 *
 * <ul>
 *   <li><b>Slug:</b> <code>minimum-deletions-to-make-string-balanced</code>
 *   <li><b>Difficulty:</b> Medium
 * </ul>
 *
 * <p><b>Solution progression (split-point approach):</b>
 *
 * <ol>
 *   <li>{@code NaiveSolution} — Brute force split-point, <code>O(n²)</code> time, <code>O(1)</code>
 *       space
 *   <li>{@code PrefixSuffixSolution} — Prefix/suffix arrays, <code>O(n)</code> time, <code>O(n)
 *       </code> space
 * </ol>
 *
 * <p><b>Solution progression (DP approach):</b>
 *
 * <ol>
 *   <li>{@code RecursiveSolution} — Brute force recursion, <code>O(2^n)</code> time, <code>O(n)
 *       </code> space
 *   <li>{@code MemoizedSolution} — Memoized recursion, <code>O(n²)</code> time, <code>O(n²)</code>
 *       space
 *   <li>{@code DpSolution} — Bottom-up DP, <code>O(n)</code> time, <code>O(n)</code> space
 *   <li>{@code Solution} — Space-optimized DP, <code>O(n)</code> time, <code>O(1)</code> space
 * </ol>
 *
 * @see <a href="https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/">Problem
 *     Link</a>
 */
package codes.yam.leetcode.minimumdeletionstomakestringbalanced;
