import java.util.Arrays;
public class Maximum_Sum_of_Non-Adjacent_Elements
{
    public static int f(int ind, int[] arr, int[] dp){
        if(ind==0) return arr[ind];
        if(ind<0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        
        int pic = arr[ind] + f(ind-2, arr,dp);
        int notPic = 0 + f(ind-1,arr,dp);
        return dp[ind] = Math.max(pic,notPic);
    }
    
	public static void main(String[] args) {
	    int[] arr = {2,1,4,9};
	    int[] dp = new int[arr.length+1];
	    Arrays.fill(dp,-1);
		System.out.println(f(arr.length-1, arr,dp));
	}
}
