class Solution { 
    long findMinSum(int[] A,int[] B,int N) { 
        long ans = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < N; i++){
            ans = ans + Math.abs(A[i] - B[i]);
        }
        
        return ans;
    }
}