class Solution {
    static int nthFibonacci(int n){
        int a = 0; 
        int b = 1;
        int nextNumber = 0;
        for(int i = 1; i < n; i++){
            nextNumber = a + b;
            nextNumber %=1000000007;
            a = b;
            a %= 1000000007;
            b = nextNumber;
            b %= 1000000007;
        }
        return nextNumber;
    }
}