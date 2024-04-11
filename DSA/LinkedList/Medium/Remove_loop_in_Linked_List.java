public class Remove_loop_in_Linked_List {

    class Node {
        int data;
        Node next;
    }

    class Solution {
        public static Node cycle(Node head) {
            if (head == null || head.next == null)
                return null;
            Node slow = head;
            Node fast = head;

            while (slow != null && fast != null) {
                fast = fast.next;
                if (fast != null) {
                    fast = fast.next;
                }

                slow = slow.next;

                if (fast == slow) {
                    return slow;
                }

            }
            return null;
        }

        public static Node startNode(Node head) {
            Node intersect = cycle(head);
            if (intersect == null)
                return null;
            Node temp = head;

            while (intersect != temp) {
                intersect = intersect.next;
                temp = temp.next;
            }
            return temp;

        }

        public static void removeLoop(Node head) {
            if (head == null)
                return;
            Node startOfLoop = startNode(head);
            Node temp = startOfLoop;
            if (startOfLoop == null)
                return;

            while (temp.next != startOfLoop) {
                temp = temp.next;
            }

            temp.next = null;
        }
    }
}
