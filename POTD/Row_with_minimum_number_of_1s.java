public class Row_with_minimum_number_of_1s {
    class Solution {
        int minRow(int n, int m, int a[][]) {
            if (n == 0 || m == 0) {
                return 0; // Handle empty matrix case
            }
            
            int rowCount = 0;
            int minOnesCount = Integer.MAX_VALUE;
            boolean flag = true;
            
            for (int i = 0; i < n; i++) {
                int onesCount = 0; // Reset onesCount for each row
                for (int j = 0; j < m; j++) {
                    if (a[i][j] == 1) {
                        onesCount++;
                        flag = false;
                    }
                }
                
                if (onesCount < minOnesCount) {
                    minOnesCount = onesCount;
                    rowCount = i+1; // Found a new row with fewer 1's
                }
                
                
            }
            
            if(flag) return 1; 
            
            
            return rowCount;
        }
    }
}
