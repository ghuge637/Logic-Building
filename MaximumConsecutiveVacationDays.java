// Problem Statement: Maximum Consecutive Vacation Days
// Andy wants to go on a vacation to de-stress himself. He can take only one continuous vacation during the next N days, where the days are numbered from 1 to N.
// Andy already has M obligations scheduled on specific days. The i-th obligation is on day D[i]. To extend his vacation, Andy is allowed to cancel at most K obligations.
// Your task is to determine the maximum number of consecutive vacation days Andy can take after canceling at most K obligations.
// Input Format
// - The first line contains three integers:
// •	N – Total number of days.
// •	M – Number of scheduled obligations.
// •	K – Maximum number of obligations that can be canceled.
// - The second line contains M space-separated integers representing the days on which the obligations are scheduled.


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int maxval(int N, int M, int K, int[] arr){
        int x = 0;
        int count = 0;
        
        for(int i=1; i<=N; i++){
            
            int k = K; count = 0;
            // System.out.print(k);
            
            for(int j=i; j<=N; j++){
                
                
                if(arr[j] == 1){
                    
                    if(k == 0){
                        break;
                    }
                        k = k - 1;
                        count += 1;
                        // System.out.print(count);
                    
                    
                }else if(arr[j]==0){
                    count+=1;
                    // System.out.print(count);
                }
                
                
                x = Math.max(x,count);
            } 
            // System.out.println("");
        }
        
        return x;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int N, M, K;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		K = sc.nextInt();
		
		int[] arr = new int[N+1];
		Arrays.fill(arr,0);
		
		for(int i=1; i<=M; i++){
		    arr[sc.nextInt()] = 1;
		}
        
        System.out.print(maxval(N,M,K,arr));
        
	}
}
