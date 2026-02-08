# Contributing

Thanks for your interest in contributing! This project welcomes contributions of all kinds.

## Ways to Contribute

- **Add a new solution** — Solve a LeetCode problem and submit it
- **Improve existing solutions** — Optimize time/space complexity or improve readability
- **Add tests** — Improve test coverage with edge cases
- **Fix bugs** — Found an issue? Fix it!
- **Improve documentation** — Clarify explanations or fix typos

## Getting Started

1. Fork and clone the repository
2. Ensure you have Java 21+ and Maven installed
3. Run `mvn test` to verify everything works

## Adding a New Solution

Follow the TDD workflow described in the README:

1. Create the test class first in `src/test/java/codes/yam/leetcode/{problem-slug}/SolutionTest.java`
2. Implement the solution in `src/main/java/codes/yam/leetcode/{problem-slug}/Solution.java`
3. Add `package-info.java` with problem metadata
4. Run `mvn test -Dtest=SolutionTest` to verify

### Code Style

- Solution classes should be package-scoped (no `public` modifier)
- Include Javadoc with time and space complexity
- Use HTML formatting in Javadoc (see existing solutions for examples)

## Pull Request Process

1. Create a branch for your changes
2. Make your changes following the code style above
3. Ensure all tests pass with `mvn test`
4. Submit a pull request with a clear description

## Recognition

This project uses [All Contributors](https://allcontributors.org/) to recognize all contributions. After your PR is
merged, you'll be added to the contributors list!

Contribution types include: code, documentation, tests, bug reports, ideas, and more.
