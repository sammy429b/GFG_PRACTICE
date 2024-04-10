public class Check_If_Circular_Linked_List {
    class GfG {
        boolean isCircular(Node head) {
            Node temp = head.next;
            if (head == null)
                return false;
            if (head.next == null)
                return false;

            while (temp != null && temp != head) {
                temp = temp.next;
            }

            if (temp == head)
                return true;
            return false;
        }
    }
}
