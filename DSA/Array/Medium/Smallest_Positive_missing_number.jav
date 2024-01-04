public class Smallest_Positive_missing_number {
class Solution
{
    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        int CI = 0;
        for(int i = 0; i < n; i++){
            CI = arr[i] -1;
            while(arr[i]>0 && arr[i]<n && arr[i]!=arr[CI]){
                swap(arr,i,CI);
                CI = arr[i] -1;
            }
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] !=i+1){
                return i+1;
            }
        }
        
        return n+1;
    }
}
}