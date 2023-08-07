import java.util.ArrayList;
import java.util.Collections;

public class JAVA_COLLECTION_SET_1_ARRAYLIST_PART_2 {
    void add_to_ArrayList(ArrayList<Integer> A, int x) {
        A.add(x);
    }

    /* sort the ArrayList A in ascending order */
    void sort_ArrayList_Asc(ArrayList<Integer> A) {
        // r code hereYou
        Collections.sort(A);
    }

    /* reverses the ArrayList A */
    void reverse_ArrayList(ArrayList<Integer> A) {
        // Your code here
        Collections.reverse(A);
    }

    /* returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A) {
        int size = A.size();
        return size;
    }

    /* sorts the ArrayList A in descending order */
    void sort_ArrayList_Desc(ArrayList<Integer> A) {
        // Your code here
        Collections.sort(A);
        Collections.reverse(A);
    }

    /*
     * prints space separated
     * elements of ArrayList A
     */
    void print_ArrayList(ArrayList<Integer> A) {
        for (Integer element : A) {
            System.out.print(element + " ");
        }
    }
}
