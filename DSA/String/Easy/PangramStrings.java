import java.util.HashSet;
import java.util.Set;

public class PangramStrings{
    class Solution {
    int isPanagram(String S) {
        Set<Character> ch = new HashSet<>();
        for (char chr : S.toLowerCase().toCharArray()) {
            if (Character.isLetter(chr)) { 
                ch.add(chr);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : ch) {
            stringBuilder.append(c);
        }
        String str = stringBuilder.toString();
        
        if (str.equals("abcdefghijklmnopqrstuvwxyz")) {
            return 1;
        }
        return 0;
    }
}
}
