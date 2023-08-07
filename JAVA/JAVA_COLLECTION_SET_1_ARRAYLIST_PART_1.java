import java.util.ArrayList;

class JAVA_COLLECTION_SET_1_ARRAYLIST_PART_1 {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) {
        ArrayList<Integer> arr = new ArrayList<>();
        if (Q == 1) {
            int p = Query.get(0);
            int q = Query.get(1);
            A.add(p, q);
            arr.addAll(A);
        } else {
            int p = Query.get(0);
            int index = A.lastIndexOf(p);
            arr.add(index);
        }

        return arr;
    }
}