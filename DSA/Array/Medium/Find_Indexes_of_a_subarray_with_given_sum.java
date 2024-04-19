public class Find_Indexes_of_a_subarray_with_given_sum {

    class Solution {
        // Function to find a subarray with given sum s in the array arr of size n
        static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
            ArrayList<Integer> result = new ArrayList<>();
            
            // If the array is empty, return -1 indicating no subarray
            if (n == 0) {
                result.add(-1);
                return result;
            }
            
            int start = 0;      // Start of the window
            int end = 0;        // End of the window
            int currentSum = 0; // Current sum of elements in the window
            
            // Check if the sum s is 0 or if the sum s is less than any element in the array
            if (s == 0 && s < arr[0] && s < arr[n-1]) {
                result.add(-1);
                return result;
            }
            
            // Sliding window approach to find the subarray with sum s
            while (end < n && start <= end) {
                currentSum += arr[end]; // Expand the window by adding arr[end] to the current sum
                
                // If current sum exceeds s, contract the window from the start
                while (currentSum > s && start <= end) {
                    currentSum -= arr[start]; // Remove arr[start] from the current sum
                    start++; // Move the start of the window forward
                }
                
                // If we find a subarray with sum s
                if (currentSum == s && start <= end) {
                    // Add the 1-based indices of the subarray to the result list
                    result.add(start + 1); // 1-based index for start
                    result.add(end + 1);   // 1-based index for end
                    return result;
                }
                
                end++; // Expand the window by moving the end forward
            }
            
            // If no subarray is found with the given sum s
            result.add(-1);
            return result;
        }
    }
    
}