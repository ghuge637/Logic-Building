class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int pre = 2;
        int pre2 = 1;

        for(int i = 2; i<n; i++){
            int cur = pre+pre2;
            pre2=pre;
            pre = cur;
        }
        return pre;
    }
}