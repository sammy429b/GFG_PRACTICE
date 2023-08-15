import java.util.Arrays;

public class Solution {
    public static int convertToASCII(String s1, String s2) {
        int difference = 0;
        for (int i = 0; i < s1.length(); i++) {
            difference += Math.abs(s1.charAt(i) - s2.charAt(i));
        }
        
        return difference;
    }

    public static int minimum_difference(int n, String[] words) {
        int[] a = new int[n*n];
        int cnt = 0;
        int countNonZeros = 0;
        for(int i = 0; i< n; i++){
            for(int j = 0; j<n; j++){
            int s = convertToASCII(words[i], words[j]);
                a[cnt++] = s;
            }
        }

        Arrays.sort(a);
        for (int value : a) {
            if (value != 0) {
                countNonZeros++;
            }
        }
        
        int[] newArray = new int[countNonZeros];
        int newIndex = 0;
        
        for (int value : a) {
            if (value != 0) {
                newArray[newIndex++] = value;
            }
        }
        if(newArray.length == 0) return 0;
        return newArray[0];
   }
}