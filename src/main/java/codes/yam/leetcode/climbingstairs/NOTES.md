# Recursion to DP: Step by Step

## Starting point: your memoized solution

```java
int rec(int n) {
    if (n == 1) return 1;
    if (n == 2) return 2;
    if (memo[n] != 0) return memo[n];
    memo[n] = rec(n - 1) + rec(n - 2);
    return memo[n];
}
```

## Steps to convert to bottom-up DP

1. **Look at what the memo array stores.** Each `memo[i]` holds the answer for input `i`. That's your DP table.

2. **Find the base cases.** These are the entries you can fill without recursion: `memo[1] = 1` and `memo[2] = 2`.

3. **Find the recurrence.** Strip away the recursion and just look at the formula:
   `memo[n] = memo[n - 1] + memo[n - 2]`.

4. **Figure out the fill order.** `memo[i]` depends on `memo[i - 1]` and `memo[i - 2]` — both smaller. So fill from
   small to large (3, 4, 5, ... n).

5. **Write the loop.** Seed the base cases, then loop from 3 to n applying the recurrence.

## Result

```java
int climbStairs(int n) {
    if (n <= 2) return n;
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}
```

## Bonus: space optimization

Notice `dp[i]` only ever reads `dp[i - 1]` and `dp[i - 2]`. You don't need the whole array — just two variables.

```java
int climbStairs(int n) {
    if (n <= 2) return n;
    int prev2 = 1, prev1 = 2;
    for (int i = 3; i <= n; i++) {
        int curr = prev1 + prev2;
        prev2 = prev1;
        prev1 = curr;
    }
    return prev1;
}
```

This drops space from O(n) to O(1).
