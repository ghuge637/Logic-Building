
import java.util.*;

class MaxDominanceScore {

    public static int maximumDominanceScore(int[] A, int N, int K) {

        int[][] dp = new int[N + 1][K + 1];

        // Calculate DP
        for (int j = 1; j <= K; j++) {

            for (int i = j; i <= N; i++) {

                HashMap<Integer, Integer> freq = new HashMap<>();
                int maxFreq = 0;

                // Try every possible starting index
                for (int p = i - 1; p >= j - 1; p--) {

                    int count = freq.getOrDefault(A[p], 0) + 1;
                    freq.put(A[p], count);

                    maxFreq = Math.max(maxFreq, count);

                    dp[i][j] = Math.max(
                        dp[i][j],
                        dp[p][j - 1] + maxFreq
                    );
                }
            }
        }

        return dp[N][K];
    }

    public static void main(String[] args) {

        int N = 6;
        int K = 2;

        int[] A = {1, 2, 2, 3, 2, 3};

        System.out.println(maximumDominanceScore(A, N, K));
    }
}
