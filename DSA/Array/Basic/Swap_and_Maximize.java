import java.util.Arrays;

class Swap_and_Maximize
{
    long maxSum(long arr[] ,int n)
    {
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0; i < n/2; i++){
            sum = sum - (2* arr[i]);
            sum = sum + (2* arr[n-i-1]);
        }
        return sum;
    }
}