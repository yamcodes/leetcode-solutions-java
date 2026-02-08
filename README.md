# LeetCode Solutions

[![All Contributors](https://img.shields.io/badge/all_contributors-1-orange.svg?style=flat-square)](#contributors)

My LeetCode solutions in Java, focused on clean code and optimal algorithms.

## Solutions

| # | Problem                                                               | Difficulty | Time              | Space  |
|---|-----------------------------------------------------------------------|------------|-------------------|--------|
| 1 | [Two Sum](https://leetcode.com/problems/two-sum/)                     | Easy       | `O(n log n)`      | `O(n)` |
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Easy       | `O(log10(n) / 2)` | `O(1)` |

## Project Structure

```
src/main/java/codes/yam/leetcode/{problem-slug}/
  Solution.java       # Solution implementation
  package-info.java   # Problem metadata

src/test/java/codes/yam/leetcode/{problem-slug}/
  SolutionTest.java       # Unit tests
  SolutionBenchmark.java  # JMH benchmarks
```

## Commands

```bash
mvn test                          # Run all tests
mvn test -Dtest=SolutionTest      # Run a specific test class
mvn javadoc:javadoc               # Generate Javadoc
```

## TDD Workflow (IntelliJ IDEA)

How to add a new LeetCode solution using test-driven development.

### 1. Write the tests first

Right-click `src/test/java/codes/yam/leetcode/` → **New → Package** → `problemslug`, then **New → Java Class** →
`SolutionTest`.

Start with LeetCode's example cases plus a few edge cases (aim for 3–5 per behavior):

**For single-arg problems** — use `@ValueSource`, grouped by expected outcome:

```java
class SolutionTest {
    private final Solution solution = new Solution();

    @ParameterizedTest(name = "{0} is a palindrome")
    @ValueSource(ints = {121, 0, 1, 1221, 12321})
    void testPalindromes(int x) {
        assertTrue(solution.isPalindrome(x));
    }

    @ParameterizedTest(name = "{0} is not a palindrome")
    @ValueSource(ints = {-121, 10, 123})
    void testNonPalindromes(int x) {
        assertFalse(solution.isPalindrome(x));
    }
}
```

**For multi-arg problems** — use `@MethodSource`:

```java
class SolutionTest {
    private final Solution solution = new Solution();

    static Stream<Arguments> cases() {
        return Stream.of(
                arguments(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),  // basic case
                arguments(new int[]{3, 2, 4}, 6, new int[]{1, 2}),       // not-first-pair
                arguments(new int[]{3, 3}, 6, new int[]{0, 1}),          // duplicates
                arguments(new int[]{-1, -2, -3, -4, -5}, -8, new int[]{2, 4})  // negatives
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    void twoSum(int[] nums, int target, int[] expected) {
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}
```

### 2. Generate the Solution class from the test

`Solution` will be red (unresolved). Put your cursor on it and press **⌥⏎** → **Create class 'Solution'**. Change the
target directory to `src/main/java` — IntelliJ creates the package automatically.

Then **⌥⏎** on the red method call → **Create method** — IntelliJ infers the signature from your test args.

### 3. Red → Green → Refactor

1. **Red:** Run the test with **⌃⇧R** — confirm it fails
2. **Green:** Write the minimal code to pass all cases
3. **Refactor:** Clean up, then re-run to verify

### 4. Add boilerplate

- Add `package-info.java` in the main source package (Right-click → **New → File**)
- Add Javadoc with time/space complexity to `Solution.java`
- Ensure `Solution` is package-scoped (no `public` modifier)

### 5. Verify with Maven

```bash
mvn test -Dtest=SolutionTest
```

### Useful shortcuts

| Shortcut | Action                                     |
|----------|--------------------------------------------|
| **⌥⏎**   | Quick fix (create class/method from usage) |
| **⌃⇧R**  | Run nearest test                           |
| **⇧⌘T**  | Toggle between class and its test          |

## Tech Stack

- **Java 21** (LTS)
- **JUnit 6** for parameterized testing
- **JMH** for benchmarking with GC profiling
- **Maven** for builds

## Contributors

<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td style="text-align: center; vertical-align: top; width: 14.28%;"><a href="https://github.com/yamcodes"><img src="https://avatars.githubusercontent.com/u/2014360?v=4?s=100" width="100" alt="Yam Borodetsky"/><br/><sub><b>Yam Borodetsky</b></sub></a><br/><a href="https://github.com/yamcodes/leetcode-solutions-java/commits?author=yamcodes" title="Code">💻</a> <a href="https://github.com/yamcodes/leetcode-solutions-java/commits?author=yamcodes" title="Documentation">📖</a> <a href="https://github.com/yamcodes/leetcode-solutions-java/commits?author=yamcodes" title="Tests">⚠️</a></td>
    </tr>
  </tbody>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->
