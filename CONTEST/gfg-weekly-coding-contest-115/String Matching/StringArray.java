import java.io.*;
import java.util.*;

public class StringArray {
    public static String[] input(BufferedReader br, int n) throws IOException {
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine().trim();
        }
        return s;
    }

    public static void print(String[] a) {
        for (String e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a) {
        for (String e : a) System.out.print(e + " ");
        System.out.println();
    }
}