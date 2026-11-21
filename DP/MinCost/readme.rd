# Minimum Cost to Reach Step N Using Fibonacci Jumps

## Problem Description

You are given three integers:

- `N`: The destination step.
- `A`: The fixed cost for each jump.
- `B`: The cost per unit of jump length.

You start at step `1` and need to reach step `N`.

You can jump only a distance that belongs to the Fibonacci sequence:

`1, 2, 3, 5, 8, 13, 21, ...`

The cost of a jump of length `k` is:

**Jump Cost = A + (B × k)**

Your task is to calculate the **minimum total cost** required to reach step `N`.

You can make as many valid jumps as needed, but you cannot jump beyond step `N`.

## Input

Three integers:

- `N` — destination step.
- `A` — fixed cost per jump.
- `B` — cost per unit of jump length.

## Output

Print a single integer representing the minimum total cost to reach step `N`.

## Example

**Input:**
```text
6 2 4
```

**Output:**
```text
22
```

**Explanation:**

The Fibonacci jump lengths are `1, 2, 3, 5`.

One optimal way to reach step 6 is:

`1 → 6`

- Jump length = `6 - 1 = 5`
- Jump cost = `2 + (4 × 5) = 22`

Therefore, the minimum total cost is **22**.

## Approach: Dynamic Programming

Define:

`dp[i]` = Minimum cost required to reach step `i` from step `1`.

**Base Case:**
```java
dp[1] = 0;
```

**Transition:**

For every step `i`, try all valid Fibonacci jump lengths `k`.

```java
dp[i] = Math.min(dp[i], dp[i-k] + A + B*k);
```

Only consider jumps where `i - k >= 1`.

## Complexity Analysis

- **Time Complexity:** `O(N × F)`, where `F` is the number of Fibonacci numbers not exceeding `N`.
- **Space Complexity:** `O(N + F)` for the DP array and Fibonacci list.
