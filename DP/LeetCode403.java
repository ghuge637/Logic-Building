// # LeetCode 403 — Frog Jump

// **Difficulty:** Hard  
// **Topics:** Dynamic Programming, HashMap, HashSet

// ## Problem Statement

// You are given an integer array `stones` in ascending order, representing the positions of stones in a river.

// A frog starts on the first stone at position `0` and wants to reach the last stone.

// The frog can make its first jump of exactly `1` unit. After each jump, if the previous jump length was `k`, the next jump must be either `k - 1`, `k`, or `k + 1` units. The frog can only jump forward, and every landing position must contain a stone.

// Return `true` if the frog can reach the last stone; otherwise, return `false`.

// ## Examples

// ### Example 1

// **Input:**
// ```text
// stones = [0,1,3,5,6,8,12,17]
// ```

// **Output:**
// ```text
// true
// ```

// **Explanation:** One valid path is:

// `0 → 1 → 3 → 5 → 8 → 12 → 17`

// The jump lengths are `1, 2, 2, 3, 4, 5`.

// ### Example 2

// **Input:**
// ```text
// stones = [0,1,2,3,4,8,9,11]
// ```

// **Output:**
// ```text
// false
// ```

// **Explanation:** The gap between positions `4` and `8` cannot be crossed using any jump sequence that follows the rules.

// ## Approach: Dynamic Programming

// Use a `HashMap<Integer, Set<Integer>>`:

// - **Key:** Stone position.
// - **Value:** All jump lengths that can reach that stone.
// - Initialize stone `0` with jump length `0`.
// - For every reachable stone and each known jump length `k`, try `k - 1`, `k`, and `k + 1`.
// - Ignore jump lengths less than or equal to zero.
// - Add valid jump lengths to the destination stone's set.
// - Return `true` if the last stone is reachable.

// ## Complexity Analysis

// Let `n` be the number of stones.

// - **Time:** Typically described as `O(n²)` for the standard dynamic-programming solution.
// - **Space:** `O(n²)` in the worst case for storing reachable jump lengths.


import java.util.*;

class LeetCode403 {
    public boolean canCross(int[] stones) {
        int n = stones.length;

        if (n == 1) {
            return true;
        }

        if (stones[1] != 1) {
            return false;
        }

        Map<Integer, Set<Integer>> dp = new HashMap<>();

        for (int stone : stones) {
            dp.put(stone, new HashSet<>());
        }

        dp.get(0).add(0);

        for (int stone : stones) {
            for (int k : dp.get(stone)) {
                for (int jump = k - 1; jump <= k + 1; jump++) {
                    if (jump <= 0) {
                        continue;
                    }

                    int nextStone = stone + jump;

                    if (nextStone == stones[n - 1]) {
                        return true;
                    }

                    if (dp.containsKey(nextStone)) {
                        dp.get(nextStone).add(jump);
                    }
                }
            }
        }

        return false;
    }
}
