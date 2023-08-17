
public class Kadanes_Algorithm{

    long maxSubarraySum(int arr[], int n){
        
       int size = arr.length;
       long sum = 0;
       long maxSum = arr[0];
       for(int i = 0; i<size;i++){
           sum = sum + arr[i];
           maxSum = Math.max(maxSum,sum);
           if(sum<0){
               sum = 0;
           }
       }
       return maxSum;
        
    }
    
}