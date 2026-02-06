package codes.yam.leetcode.palindromenumber;


/**
 * <p>Solution for the <b>Palindrome Number</b> problem.</p>
 * <ul>
 * <li><b>Time Complexity:</b> <code>O(log10(n))</code></li>
 * <li><b>Space Complexity:</b> <code>O(1)</code></li>
 * </ul>
 */
class Solution {
    /**
     * Checks if an integer is a palindrome.
     *
     * @param x The integer to check.
     * @return true if x is a palindrome, false otherwise.
     */
    public boolean isPalindrome(int x) {
        return isPalindromeNaive(x);
    }

    /**
     * The naive way of solving `isPalindrome` - by converting to string.
     *
     * @param x The integer to check.
     * @return true if x is a palindrome, false otherwise.
     */
    private boolean isPalindromeNaive(int x) {
        final String xAsString = String.valueOf(x);
        for (int i = 0; i <= xAsString.length() / 2; i++) {
            final char a = xAsString.charAt(i);
            final char b = xAsString.charAt(xAsString.length() - 1 - i);
            if (a != b) return false;
        }
        return true;
    }
}