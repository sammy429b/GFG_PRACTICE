public class Two _Repeated_Elements {
    class Solution
{
    //Function to find two repeated elements.
    public int[] twoRepeated(int arr[], int n)
    {
        int idx = 0;
        int result[] = new int[2];
        for(int i = 0; i < n+2; i++){
            int index = Math.abs(arr[i]);
            if(arr[index]>0){
                arr[index] = - arr[index];
            }else{
                result[idx++] = index;
            }
        }
        return result;
    }
    
}
}
