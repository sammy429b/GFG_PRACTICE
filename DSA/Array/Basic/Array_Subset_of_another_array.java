import java.util.Arrays;

public class Array_Subset_of_another_array {
    class Compute {
        // Method to check if array a2 is a subset of array a1
        public String isSubset(long a1[], long a2[], long n, long m) {
            // Sort both arrays for efficient comparison
            Arrays.sort(a1);
            Arrays.sort(a2);
            
            // Initialize pointers for array traversal
            int i = 0, j = 0;
            
            // Traverse both arrays simultaneously
            while (i < n && j < m) {
                // If elements at current positions are equal, move both pointers forward
                if (a1[i] == a2[j]) {
                    i++;
                    j++;
                } else {
                    // If elements are not equal, move pointer for a1 forward
                    i++;
                }
            }
            
            // If j has reached the end of a2, then a2 is a subset of a1
            if (j == m)
                return "Yes"; // Return "Yes" indicating a2 is a subset of a1
            else
                return "No";  // Return "No" indicating a2 is not a subset of a1
        }
    }
}
