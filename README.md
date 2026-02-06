# LeetCode Solutions

My LeetCode solutions in Java 21, focused on clean code and optimal algorithms.

## Solutions

| # | Problem | Difficulty | Time | Space |
|---|---------|------------|------|-------|
| 9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/) | Easy | `O(log10(n) / 2)` | `O(1)` |

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

## Tech Stack

- **Java 21** (LTS)
- **JUnit 5** for parameterized testing
- **JMH** for benchmarking with GC profiling
- **Maven** for builds
