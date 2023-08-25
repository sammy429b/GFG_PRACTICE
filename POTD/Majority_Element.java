import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    class Solution {
        static int majorityElement(int a[], int size) {
            int indexKey = -1;
            Map<Integer, Integer> mp = new HashMap<>();

            for (int element : a) {
                if (mp.containsKey(element)) {
                    mp.put(element, mp.get(element) + 1);
                } else {
                    mp.put(element, 1);
                }
            }

            int maxCount = -1;
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                Integer value = entry.getValue();

                if (value > maxCount) {
                    maxCount = value;
                    indexKey = entry.getKey();
                }
            }

            if (a.length == 1) {
                return a[0];
            }

            if (maxCount > size / 2) {
                return indexKey;
            } else {
                return -1;
            }
        }

    }
}
