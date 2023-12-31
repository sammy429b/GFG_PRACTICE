package DSA.LinkedList.Easy;

public class Nth_node_from_end_of_linked_list {
    class Solution {
        // Function to find the data of nth node from the end of a linked list.
        int getNthFromLast(Node head, int n) {
            int count = 0;
            Node tempHead = head;
            Node tempNode = head;

            while (tempHead != null) {
                count++;
                tempHead = tempHead.next;
                if (count > n) {
                    tempNode = tempNode.next;
                }
            }
            if (count < n)
                return -1;
            return tempNode.data;
        }
    }
}
