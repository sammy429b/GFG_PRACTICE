package DSA.String.Easy;

import java.util.HashSet;

public class Remove_all_duplicates_from_a_given_string {
    class Solution {
    String removeDuplicates(String str) {
        // StringBuilder to store the result string without duplicates
        StringBuilder result = new StringBuilder();
        
        // HashSet to keep track of seen characters
        HashSet<Character> seen = new HashSet<>();
        
        // Iterate through each character in the input string
        for (char ch : str.toCharArray()) {
            // If the character is not already seen, add it to the result string
            // and mark it as seen by adding it to the HashSet
            if (seen.add(ch)) {
                result.append(ch);
            }
        }
        
        // Return the final result string without duplicates
        return result.toString();
    }
}

}
