/**
 * Solutions for the "Coin Change" problem on LeetCode.
 *
 * <ul>
 *   <li><b>Slug:</b> <code>coin-change</code>
 *   <li><b>Difficulty:</b> Medium
 * </ul>
 *
 * <p><b>Solution progression:</b>
 *
 * <ol>
 *   <li>{@link codes.yam.leetcode.coinchange.SolutionDpNaive} — bottom-up DP using {@code -1} as
 *       the sentinel for unreachable states. Requires special-casing {@code c == amount} and a
 *       {@code useMin} flag to avoid treating unset cells as valid.
 *   <li>{@link codes.yam.leetcode.coinchange.SolutionDp} — same bottom-up DP, but uses {@code
 *       amount + 1} as the infinity sentinel. Since {@code ∞ + 1 = ∞} and {@code min(∞, x) = x},
 *       the sentinel is algebraically compatible with the recurrence and all special cases
 *       collapse.
 * </ol>
 *
 * @see <a href="https://leetcode.com/problems/coin-change/">Problem Link</a>
 */
package codes.yam.leetcode.coinchange;
