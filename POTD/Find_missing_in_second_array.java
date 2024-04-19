public class Find_missing_in_second_array {
    class Solution {
    
        ArrayList<Integer> findMissing(int a[], int b[], int n, int m) {
            // Create a new ArrayList to store the missing elements
            ArrayList<Integer> result = new ArrayList<>();
            // Create a HashSet to store all elements of array 'b' for quick lookup
            Set<Integer> st = new HashSet<>();
            
            // Add all elements of array 'b' into the HashSet 'st'
            for (int i = 0; i < m; i++) {
                st.add(b[i]);
            }
            
            // Traverse through array 'a' to find elements not present in 'b'
            for (int i = 0; i < n; i++) {
                // If the current element of 'a' is not in HashSet 'st' (not present in 'b')
                if (!st.contains(a[i])) {
                    // Add this element to the result ArrayList
                    result.add(a[i]);
                }
            }
            
            return result;
        }
    }
}
