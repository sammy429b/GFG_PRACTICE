package DSA.LinkedList.Easy;

public class Given_a_linked_list_of_0s_1s_and_2s_sort_it {
    class Solution {
    // Function to sort a linked list of 0s, 1s, and 2s.
    static Node segregate(Node head) {
        if (head == null || head.next == null) {
            return head; // If the list is empty or has only one element, no need to segregate
        }

        // Counting occurrences of 0s, 1s, and 2s
        int zero = 0, one = 0, two = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                zero++;
            } else if (temp.data == 1) {
                one++;
            } else {
                two++;
            }
            temp = temp.next;
        }

        // Overwriting list with sorted elements
        temp = head;
        while (temp != null) {
            if (zero != 0) {
                temp.data = 0;
                zero--;
            } else if (one != 0) {
                temp.data = 1;
                one--;
            } else {
                temp.data = 2;
                two--;
            }
            temp = temp.next;
        }

        return head;
    }
}
}
