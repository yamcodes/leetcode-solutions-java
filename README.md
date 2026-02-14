# LeetCode Solutions

[![All Contributors](https://img.shields.io/github/all-contributors/yamcodes/leetcode-solutions-java?color=ee8449)](#contributors)

My LeetCode solutions in Java, focused on clean code and optimal algorithms.

## Solutions

| #*              | Problem                                                                                                                          | Difficulty | Time              | Space  |
|-----------------|----------------------------------------------------------------------------------------------------------------------------------|------------|-------------------|--------|
| [1][lc-1]       | [Two Sum](src/main/java/codes/yam/leetcode/twosum/Solution.java)                                                                 | Easy       | `O(n log n)`      | `O(n)` |
| [9][lc-9]       | [Palindrome Number](src/main/java/codes/yam/leetcode/palindromenumber/Solution.java)                                             | Easy       | `O(log10(n) / 2)` | `O(1)` |
| [70][lc-70]     | [Climbing Stairs](src/main/java/codes/yam/leetcode/climbingstairs/Solution.java)                                                 | Easy       | `O(n)`            | `O(1)` |
| [746][lc-746]   | [Min Cost Climbing Stairs](src/main/java/codes/yam/leetcode/mincostclimbingstairs/Solution.java)                                 | Easy       | `O(n)`            | `O(1)` |
| [1653][lc-1653] | [Minimum Deletions to Make String Balanced](src/main/java/codes/yam/leetcode/minimumdeletionstomakestringbalanced/Solution.java) | Medium     | `O(n)`            | `O(1)` |

<sup>*Problem numbers link to LeetCode; problem names link to solution source.</sup>

[lc-1]: https://leetcode.com/problems/two-sum/

[lc-9]: https://leetcode.com/problems/palindrome-number/

[lc-70]: https://leetcode.com/problems/climbing-stairs/

[lc-746]: https://leetcode.com/problems/min-cost-climbing-stairs/

[lc-1653]: https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/

## Project Structure

```
src/main/java/codes/yam/leetcode/{problem-slug}/
  Solution.java              # Optimal/final solution
  SolutionNaive.java         # Additional solutions (prefix naming: Solution*.java)
  SolutionDp.java
  package-info.java          # Problem metadata & solution progression

src/test/java/codes/yam/leetcode/{problem-slug}/
  TestCases.java             # Shared test data (static Stream<Arguments> cases())
  SolutionTest.java          # Tests Solution.java
  SolutionNaiveTest.java     # One test file per solution
  SolutionBenchmark.java     # JMH benchmarks (optional)
```

When a problem has multiple solution approaches, each gets its own `Solution*.java` class. `Solution.java` is always the
optimal/final version. The progression is documented in `package-info.java`. Test data lives in a shared
`TestCases.java`,
and each solution has its own test file using `@MethodSource` to reference it.

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

**For single-argument problems with groupable outcomes** (e.g., boolean results — group inputs by true/false) — use
`@ValueSource`:

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

**When each input has a distinct expected output** (e.g., `climbStairs(3) → 3`) — use `@MethodSource` with `TestCases`:

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

- **Java 25** (LTS)
- **JUnit 6** for parameterized testing
- **JMH** for benchmarking with GC profiling
- **Maven** for builds

## Contributors

<!--suppress HtmlDeprecatedAttribute, HtmlUnknownAnchorTarget -->
<!-- ALL-CONTRIBUTORS-LIST:START - Do not remove or modify this section -->
<!-- prettier-ignore-start -->
<!-- markdownlint-disable -->
<table>
  <tbody>
    <tr>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/yamcodes"><img src="https://avatars.githubusercontent.com/u/2014360?v=4?s=100" width="100px;" alt="Yam Borodetsky"/><br /><sub><b>Yam Borodetsky</b></sub></a><br /><a href="https://github.com/yamcodes/leetcode-solutions-java/commits?author=yamcodes" title="Code">💻</a> <a href="https://github.com/yamcodes/leetcode-solutions-java/commits?author=yamcodes" title="Documentation">📖</a> <a href="https://github.com/yamcodes/leetcode-solutions-java/commits?author=yamcodes" title="Tests">⚠️</a> <a href="#infra-yamcodes" title="Infrastructure (Hosting, Build-Tools, etc)">🚇</a></td>
      <td align="center" valign="top" width="14.28%"><a href="https://github.com/HoudaBelhad"><img src="https://avatars.githubusercontent.com/u/115419309?v=4?s=100" width="100px;" alt="Houda Belhad"/><br /><sub><b>Houda Belhad</b></sub></a><br /><a href="#infra-HoudaBelhad" title="Infrastructure (Hosting, Build-Tools, etc)">🚇</a></td>
    </tr>
  </tbody>
</table>

<!-- markdownlint-restore -->
<!-- prettier-ignore-end -->

<!-- ALL-CONTRIBUTORS-LIST:END -->
