public class Move_all_negative_elements_to_end {
    class Solution {

        public void segregateElements(int arr[], int n) {
            // new aaray A
            int[] A = new int[n];
            int j = 0;
            // store first all postive element
            for (int i = 0; i < n; i++) {
                if (arr[i] >= 0) {
                    A[j] = arr[i];
                    j++;
                }
            }
            // store all negative element
            for (int i = 0; i < n; i++) {
                if (arr[i] < 0) {
                    A[j] = arr[i];
                    j++;
                }
            }
            // map new array elements to old array
            for (int i = 0; i < n; i++) {
                arr[i] = A[i];
            }

        }
    }
}
