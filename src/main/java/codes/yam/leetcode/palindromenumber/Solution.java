package codes.yam.leetcode.palindromenumber;


/**
 * <p>Solution for the <b>Palindrome Number</b> problem.</p>
 * <ul>
 * <li><b>Time Complexity:</b> <code>O(log10(n) / 2)</code></li>
 * <li><b>Space Complexity:</b> <code>O(1)</code></li>
 * </ul>
 */
class Solution {
    /**
     * Checks if an integer is a palindrome by reversing only the second half of the digits and comparing with the first
     * half.
     *
     * @param x The integer to check.
     * @return true if x is a palindrome, false otherwise.
     */
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int y = 0;
        while (x > y) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        return x == y || x == y / 10;
    }
}