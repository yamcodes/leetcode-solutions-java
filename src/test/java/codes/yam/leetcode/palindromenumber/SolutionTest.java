package codes.yam.leetcode.palindromenumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest(name = "{0} is a palindrome")
    @ValueSource(ints = {121, 0, 1, 7, 11, 33, 1221, 12321, 1234321})
    void testPalindromes(int x) {
        assertTrue(solution.isPalindrome(x));
    }

    @ParameterizedTest(name = "{0} is not a palindrome")
    @ValueSource(ints = {-121, -1, 10, 221, 123, 1000021})
    void testNonPalindromes(int x) {
        assertFalse(solution.isPalindrome(x));
    }
}
