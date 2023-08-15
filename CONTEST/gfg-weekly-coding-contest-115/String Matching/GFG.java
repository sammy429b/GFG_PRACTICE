
// import java.lang.*;
import java.io.*;

public class GFG {
   public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            String[] words = StringArray.input(br, n);

            Solution obj = new Solution();
            int res = obj.minimum_difference(n, words);

            System.out.println(res);
        }
    }
}

