package DSA.Array.Easy;

public class Product_array_puzzle {
    class Solution {
        public static long[] productExceptSelf(int nums[], int n) {
            long[] result = new long[n];
            
            // Edge case: If the input array contains only one element, return an array with that element as 1.
            if (n == 1) {
                result[0] = 1;
                return result;
            }
            
            // Calculate product of all elements to the left of i
            long leftProduct = 1;
            for (int i = 0; i < n; i++) {
                result[i] = leftProduct;
                leftProduct *= nums[i];
            }
            
            // Calculate product of all elements to the right of i
            long rightProduct = 1;
            for (int i = n - 1; i >= 0; i--) {
                result[i] *= rightProduct;
                rightProduct *= nums[i];
            }
            
            return result;
        }
    }
}
