# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Test Commands

This is a Maven project using **Java 25 (LTS)**.

- **Build:** `mvn compile`
- **Test all:** `mvn test`
- **Test single class:** `mvn test -Dtest=ClassName`
- **Generate Javadoc:** `mvn javadoc:javadoc` (configured for private visibility)

## Architecture

Each LeetCode problem lives in its own package under `codes.yam.leetcode`:

```
src/main/java/codes/yam/leetcode/{problemslug}/
├── Solution.java       # The solution implementation
└── package-info.java   # Problem metadata (slug, difficulty, link)
```

Tests go under `src/test/java/codes/yam/leetcode/{problemslug}/`.

## Code Conventions

**Solution classes** are package-scoped (not `public`), named `Solution`, and use HTML-formatted Javadoc:

```java
/**
 * <p>Solution for the <b>Problem Name</b> problem.</p>
 * <ul>
 * <li><b>Time Complexity:</b> <code>O(...)</code></li>
 * <li><b>Space Complexity:</b> <code>O(...)</code></li>
 * </ul>
 */
class Solution { ... }
```

**package-info.java** documents problem metadata with the same HTML style:

```java
/**
 * <p>Solutions for the "Problem Name" problem on LeetCode.</p>
 * <ul>
 * <li><b>Slug:</b> <code>problem-slug</code></li>
 * <li><b>Difficulty:</b> Easy/Medium/Hard</li>
 * </ul>
 *
 * @see <a href="https://leetcode.com/problems/problem-slug/">Problem Link</a>
 */
package codes.yam.leetcode.problemslug;
```

## Dependencies

- **JUnit Jupiter 6** for testing
