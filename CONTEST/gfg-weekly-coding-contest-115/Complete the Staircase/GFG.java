//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
// import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            Solution ob = new Solution();
           int ans = ob.completeRows(n);
            
            System.out.println(ans);
            sc.close();
        }
    }
    
    
    

}