public class Solution {
    public int completeRows(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            n -= i;
            if (n >= 0) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}