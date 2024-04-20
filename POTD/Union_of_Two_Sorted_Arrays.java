public class Union_of_Two_Sorted_Arrays {
    class Solution {
    
        public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
            ArrayList<Integer> result = new ArrayList<>();
            
            // Create a HashSet to keep track of elements in the union (to avoid duplicates).
            HashSet<Integer> set = new HashSet<>();
            
            // Add all elements of arr1 to the result ArrayList and the HashSet.
            for (int num : arr1) {
                if (set.add(num)) {
                    result.add(num);
                }
            }
            
            // Add all elements of arr2 to the result ArrayList and the HashSet.
            for (int num : arr2) {
                if (set.add(num)) {
                    result.add(num);
                }
            }
            
            // Sort the result ArrayList.
            Collections.sort(result);
            
            return result;
        }
    }
}
