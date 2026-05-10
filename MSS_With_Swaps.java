/**Given an array a of length n and an integer k. You must perform the following operation exactly k times:
choose two indices i, j and swap**(ai, aj).**
Find the maximum possible MSS (maximum subarray sum) after performing the above operation exactly
k times.
Note:
Swapping the same pair again is allowed but useless (a double-swap cancels out). Therefore,
performing exactly k swaps is equivalent to at most k useful swaps.
Input Format
The first line contains an integer, n, denoting the size of array
The next line contains an integer, k, denoting the number of swaps.
Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer describing a[i].

  Constraints
2 <= n <= 500
0 <= k <= n

-1000 <= a[i] <= 1000

Sample Test Cases

Case 1

Input:
3
1
1
-5
2
Output:
3
Explanation:
By swapping 1 and -5, we get a maximum subarray sum equal to 1 + 2 = 3.
Case 2

Input:
3
0
5
-1
5
Output:
9
Explanation:
The maximum array sum is equal to the sum of the entire array 5 - 1 + 5 = 9, and it's not possible to
achieve a greater sum. **/

  
public class MSS_With_Swaps
{
    static int answer = Integer.MIN_VALUE;
    
    public static int maxsum(int[] arr){
        int currentsum = arr[0];
        int maxsum = arr[0];
        
        for(int i=1; i<arr.length; i++){
            int num = arr[i];
            
            if(currentsum+num > num){
                currentsum += num;
            }else{
                currentsum = num;
            }
            
            if(maxsum<currentsum){
                maxsum = currentsum;
            }
        }
        
        return maxsum;
    }
    
    static void swap(int[] arr, int i, int j){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
    
    static void solve(int[] arr, int k){
        answer = Math.max(answer,maxsum(arr));
        
        if(k==0){return;}
        
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                swap(arr,i,j);
                
                solve(arr,k-1);
                
                swap(arr,i,j);
            }
        }
        
    }
    
	public static void main(String[] args) {
		int[] arr = {5,-1,5};
		int k = 0;
		
		solve(arr, k);
		System.out.print(answer);
	}
}
