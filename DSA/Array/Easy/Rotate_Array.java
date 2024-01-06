public class Rotate_Array {
    class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
    static void rotateArr(int arr[], int d, int n)
    {
        int[] temp = new int[n]; 
        
        for(int i=0; i<n; i++){
            temp[i] = arr[(i+d)%n] ;
        }
        
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }
    }
}
}
