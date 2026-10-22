import java.util.*;
public class Fibonachi
{
    static int fibo(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1) return dp[n];
       return dp[n]=fibo(n-1,dp)+fibo(n-2,dp); 
    }
    
	public static void main(String[] args) {
	    int n;
	    Scanner sc = new Scanner(System.in);
	    n=sc.nextInt();
	    int[] dp = new int[n+1];
	    Arrays.fill(dp,-1);
	    System.out.println(fibo(n,dp));
  	}
}


// bottom up approach -> tabuiozation
/*
public class Fibonachi
{
	public static void main(String[] args) {
	    int n = 7;
	    
	    int prev = 1;
	    int prev2 = 0;
	    
	    for(int i=2; i<=n; i++){
	        int cur = prev + prev2;
	        prev2 = prev;
	        prev = cur;
	    }
		System.out.println(prev);
	}
}
*/
