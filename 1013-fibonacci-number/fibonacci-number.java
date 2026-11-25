class Solution {
    public int fib(int n) {

        if(n < 1) return 0;
        if(n == 1) return 1;

        int a = 0;
        int b = 1;
        int result = 0;

        for(int i=1; i<n; i++){
            result = a+b;
            a = b;
            b = result;
        }

        return result;
    }
}