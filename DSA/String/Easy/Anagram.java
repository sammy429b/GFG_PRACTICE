public class Anagram {
    class Solution {
        // Function is to check whether two strings are anagram of each other or not.
        public static boolean isAnagram(String s, String t) {
            if (s.length() != t.length())
                return false;

            int[] charCount = new int[26];

            for (int i = 0; i < s.length(); i++) {
                charCount[s.charAt(i) - 'a']++;Move all negative elements to end

                charCount[t.charAt(i) - 'a']--;
            }
            for (int count : charCount) {
                if (count != 0)
                    return false;
            }
            return true;
        }
    }
}
