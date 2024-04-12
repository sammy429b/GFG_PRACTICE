public class Merge_Sort_for_Linked_List {

    class Node {
        int data;
        Node next;

        Node(int key) {
            this.data = key;
            next = null;
        }
    }

    class Solution {

        static Node merge(Node left, Node right) {
            Node dummy = new Node(-1);
            Node temp = dummy;

            while (left != null && right != null) {
                if (left.data < right.data) {
                    temp.next = left;
                    left = left.next;
                } else {
                    temp.next = right;
                    right = right.next;
                }
                temp = temp.next;
            }

            // Append remaining nodes of left or right sublist
            if (left != null) {
                temp.next = left;
            } else {
                temp.next = right;
            }

            return dummy.next;
        }

        // Find the middle node of the linked list
        static Node findMiddle(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        // Sort the linked list using merge sort
        static Node mergeSort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            // Find the middle node
            Node middle = findMiddle(head);
            Node nextOfMiddle = middle.next;
            middle.next = null; // Split the list into two halves

            // Recursively sort the left and right halves
            Node leftNode = mergeSort(head);
            Node rightNode = mergeSort(nextOfMiddle);

            // Merge the sorted halves
            return merge(leftNode, rightNode);
        }
    }
}
