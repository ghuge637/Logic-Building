import java.util.*;
public class FrogJump
{
    public static int f(int ind, int[] arr,int[] dp){
        if(ind==0) return 0;
        if(dp[ind]!=-1) return dp[ind];   // this is DP array 
        
        int left = f(ind-1,arr,dp)+Math.abs(arr[ind]-arr[ind-1]);  // abs() for remove negative sign and alwase return posative number
        int right = Integer.MAX_VALUE;
        
        if(ind>1){
            right = f(ind-2,arr,dp)+Math.abs(arr[ind]-arr[ind-2]);
        }
        return Math.min(left, right);
    }
  
    public static int frog(int ind,int[] arr,int[] dp){
        return f(ind-1,arr,dp);
    }
  
	public static void main(String[] args) {
		int[] arr = {30,10,60,10,60,50};
		int[] dp = new int[arr.length+1];
		Arrays.fill(dp,-1);
		System.out.println(frog(arr.length,arr,dp));
	}
}
