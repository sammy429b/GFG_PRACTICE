package DSA.LinkedList.Medium;

public class Reverse_a_Linked_List_in_groups_of_given_size {

    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    class Solution {
        public static Node reverse(Node head, int k) {
            if (head == null) {
                return null;
            }

            int count = 0;
            Node prev = null;
            Node curr = head;
            Node next = null;

            // Reverse the first k nodes
            while (curr != null && count < k) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count++;
            }

            // Recursive call to reverse next k nodes
            if (next != null) {
                head.next = reverse(next, k);
            }

            return prev;
        }
    }

}
