import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Find_duplicates_in_an_array{
    class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
       ArrayList<Integer> result = new ArrayList<>();
       Arrays.sort(arr);
       for(int i = 1; i < n  ; i++){
           if(arr[i-1] == arr[i]){
               result.add(arr[i]);
            }
       }
       Set<Integer> st = new HashSet<>(result);
       result.clear();
       result.addAll(st);
       Collections.sort(result);
       if(result.size()<1) result.add(-1);
       return result;
    }
}
}