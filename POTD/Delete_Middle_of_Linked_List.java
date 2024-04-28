public class Delete_Middle_of_Linked_List {
   
class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}


class Solution {
    Node deleteMid(Node head) {
        Node prev = head;
        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prev.next = prev.next.next;
        
        return head;
    }
}
}
