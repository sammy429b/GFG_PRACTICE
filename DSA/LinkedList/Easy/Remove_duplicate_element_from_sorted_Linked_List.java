package DSA.LinkedList.Easy;

public class Remove_duplicate_element_from_sorted_Linked_List {
    class GfG
{
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        if (head == null || head.next == null)
            return head;

        Node current = head;

        // Traverse the list
        while (current != null && current.next != null) {
            // If current node's data is the same as next node's data
            if (current.data == current.next.data) {
                // Skip the next node by updating current's next pointer
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return head;
    }
}

}
