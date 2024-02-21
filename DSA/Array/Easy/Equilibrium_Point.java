public class Equilibrium_Point {
    class Solution {

        // Function to find equilibrium point in the array.
        public static int equilibriumPoint(long arr[], int n) {
            // If there's only one element, it's the equilibrium point
            if (n == 1) {
                return 1;
            }

            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                totalSum += arr[i];
            }

            long leftSum = 0;
            for (int i = 0; i < n; i++) {
                // Subtract current element from total sum to get right sum
                totalSum -= arr[i];

                if (leftSum == totalSum) {
                    return i + 1; // Found equilibrium point
                }

                leftSum += arr[i]; // Add current element to left sum
            }

            // If no equilibrium point found
            return -1;
        }
    }
}
