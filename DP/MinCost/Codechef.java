import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static long findval(ArrayList<Integer> fibo, int N, int A, int B){
        long[] dp = new long[N+1];
        Arrays.fill(dp, Long.MAX_VALUE);
        dp[1]=0;
        
        for(int i=2; i<=N; i++){
            for(int k:fibo){
                if(i-k>=1){
                    long newCost = dp[i-k]+ A +(long) B*k;
                    dp[i] = Math.min(dp[i], newCost);
                }
            }
        }
        return dp[N];
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		int N = 6;
        int A = 2;
        int B = 4;
        
        ArrayList<Integer> fibo = new ArrayList<>();
        int a=1, b=2;
        while(a<N){
            fibo.add(a);
            int c = a+b;
            a = b;
            b = c;
        }
        
        System.out.print(findval(fibo, N, A, B));
	}
}
