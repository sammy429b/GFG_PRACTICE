import java.util.HashSet;
import java.util.Set;


public class Union_of_two_arrays {
    class Solution {
    public static int doUnion(int a[], int n, int b[], int m) {
        Set<Integer> unionSet = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            unionSet.add(a[i]);
        }
        
        for (int j = 0; j < m; j++) {
            unionSet.add(b[j]);
        }
        
        return unionSet.size();
    }
}
}