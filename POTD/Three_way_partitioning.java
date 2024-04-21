public class Three_way_partitioning {
    class Solution {
        // Helper method to swap elements in the array
        private static void swap(int a[], int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        
        public void threeWayPartition(int arr[], int a, int b) {
            int start = 0;      // Pointer for elements less than 'a'
            int curr = 0;       // Pointer to traverse the array
            int end = arr.length - 1; // Pointer for elements greater than 'b'
            
            // Traverse the array using 'curr' pointer until it reaches 'end'
            while (curr <= end) {
                if (arr[curr] < a) {
                    // If current element is less than 'a', swap it with
                    // the element at 'start' and move both pointers forward
                    swap(arr, start, curr);
                    start++;
                    curr++;
                } else if (arr[curr] > b) {
                    // If current element is greater than 'b', swap it with
                    // the element at 'end' and move 'end' pointer backward
                    swap(arr, curr, end);
                    end--;
                    // Note: 'curr' is not incremented here to re-evaluate the swapped element
                } else {
                    // If current element is between 'a' and 'b', move 'curr' pointer forward
                    curr++;
                }
            }
        }
    }
}
