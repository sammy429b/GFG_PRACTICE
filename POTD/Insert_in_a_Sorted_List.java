public class Insert_in_a_Sorted_List {
    class Solution {
        Node sortedInsert(Node head1, int key) {
            Node newNode = new Node(key);
            
            if(head1==null || key<head1.data){
                newNode.next = head1;
                return newNode;
            }
        
            Node current = head1;
            
            while(current.next != null && key>=current.next.data){
                current = current.next;
            }
            
            newNode.next = current.next;
            current.next = newNode;
            return head1;
        
        }
    }
}
