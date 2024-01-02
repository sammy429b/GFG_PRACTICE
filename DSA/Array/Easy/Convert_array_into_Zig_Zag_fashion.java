public class Convert_array_into_Zig_Zag_fashion {
    class Solution{
    public void zigZag(int a[], int n){
        boolean flag = true;  // Flag to track whether to compare greater or lesser

        // Iterate through the array, comparing and swapping elements
        for (int i = 0; i < n - 1; i++) {
            if (flag) {
                // If flag is true, ensure arr[i] is less than arr[i+1]
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                }
            } else {
                // If flag is false, ensure arr[i] is greater than arr[i+1]
                if (a[i] < a[i + 1]) {
                    swap(a, i, i + 1);
                }
            }
            flag = !flag;  // Toggle the flag for the next iteration
        }
    }

    // Helper function to swap two elements in the array
    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
}
