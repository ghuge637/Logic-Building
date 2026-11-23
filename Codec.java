// # Minimum Adjacent Swaps to Group Identical Characters

// **Difficulty:** Medium  
// **Topics:** String, Array, Greedy, Mathematics

// ## Problem Statement

// You are given a binary string `s` consisting only of the characters `'0'` and `'1'`.

// Your task is to find the **minimum number of adjacent swaps** required to make all occurrences of either `'0'` or `'1'` appear together in one contiguous group.

// You can choose to group either all `'0'` characters or all `'1'` characters. Return the minimum number of adjacent swaps among these two possibilities.

// An adjacent swap means exchanging two neighboring characters.

// ## Examples

// ### Example 1

// **Input:**
// ```text
// s = "1001"
// ```

// **Output:**
// ```text
// 0
// ```

// **Explanation:**

// All occurrences of `'0'` are already together:

// ```text
// 1 0 0 1
// ```

// No swaps are required.

// ### Example 2

// **Input:**
// ```text
// s = "10101"
// ```

// **Output:**
// ```text
// 1
// ```

// **Explanation:**

// We can group all zeros together by performing one adjacent swap:

// ```text
// 1 0 1 0 1
//       ↓
// 1 0 0 1 1
// ```

// Therefore, the minimum number of swaps is `1`.

// ### Example 3

// **Input:**
// ```text
// s = "01000"
// ```

// **Output:**
// ```text
// 0
// ```

// **Explanation:**

// There is only one occurrence of `'1'`. A single character is already considered a contiguous group.

// Therefore, no swaps are required.

// ### Example 4

// **Input:**
// ```text
// s = "110010"
// ```

// **Output:**
// ```text
// 1
// ```

// **Explanation:**

// The zeros can be grouped together using one adjacent swap:

// ```text
// 1 1 0 0 1 0
//         ↓
// 1 1 0 0 0 1
// ```

// Therefore, the minimum number of swaps is `1`.

// ## Constraints

// - `1 <= s.length <= 10^5`
// - `s[i]` is either `'0'` or `'1'`.

// ## Expected Complexity

// - **Time Complexity:** `O(N)`
// - **Space Complexity:** `O(N)`

// ## Notes

// - You can group either zeros or ones.
// - A group containing zero or one occurrence requires no swaps.
// - Only adjacent characters can be swapped.
// - Return the minimum cost between grouping zeros and grouping ones.


import java.util.*;

class Codec{
    
    public static void main(String[] args){
        String st = "11011";
        
        ArrayList<Integer> o = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        
        for(int i=0; i<st.length(); i++){
            if(st.charAt(i)=='0'){
                o.add(i);
            }else{
                l.add(i);
            }
        }
        
        int[] arr = new int[o.size()];
        for(int i = 0; i<arr.length; i++){
            arr[i] = o.get(i)-i;
        }
        
        int sum =0;
        if(arr.length>=2){
            int median = arr[(arr.length-1) / 2];
            for(int i=0; i<arr.length; i++){
                arr[i] = Math.abs(arr[i] - median);
            }
            for(int i=0; i<arr.length; i++){
                sum += arr[i];
            }
        }
        
        
        // for a 1 value swap
        int[] arr1 = new int[l.size()];
        for(int i = 0; i<arr1.length; i++){
            arr1[i] = l.get(i)-i;
        }
        
        int sum1 =0;
        if(arr1.length>1){
            int median1 = arr1[(arr1.length-1) / 2];
            for(int i=0; i<arr1.length; i++){
                arr1[i] = Math.abs(arr1[i] - median1);
            }
            for(int i=0; i<arr1.length; i++){
                sum1 += arr1[i];
            }
        }
        
        System.out.print(Math.min(sum, sum1));
    }
}
