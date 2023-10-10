public class Roman_Number_to_Integer {
    //{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
    int result = 0;
    int prevValue = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
        char currentChar = s.charAt(i);
        int currentValue = 0;

        switch (currentChar) {
            case 'I':
                currentValue = 1;
                break;
            case 'V':
                currentValue = 5;
                break;
            case 'X':
                currentValue = 10;
                break;
            case 'L':
                currentValue = 50;
                break;
            case 'C':
                currentValue = 100;
                break;
            case 'D':
                currentValue = 500;
                break;
            case 'M':
                currentValue = 1000;
                break;
        }

        if (currentValue < prevValue) {
            result -= currentValue;
        } else {
            result += currentValue;
        }

        prevValue = currentValue;
    }

    return result;
}


}
}
