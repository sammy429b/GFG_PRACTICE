public class Reverse_a_String {
    class Reverse {
        public static String reverseWord(String str) {
            String s = "";
            int size = str.length() - 1;
            for (int i = size; i >= 0; i--) {
                s += str.charAt(i);
            }
            return s;
        }
    }
}
