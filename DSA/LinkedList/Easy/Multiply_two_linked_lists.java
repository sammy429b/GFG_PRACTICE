package DSA.LinkedList.Easy;

public class Multiply_two_linked_lists {
    class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}

class GfG {
    public long multiplyTwoLists(Node l1, Node l2) {
        // Initialize two variables to store the numbers from linked lists
        long num1 = 0;
        long num2 = 0;
        long num3 = 1;
        long MOD = 1000000007;

        // Traverse the first linked list (l1) and calculate the number
        while (l1 != null) {
            num1 = (num1 * 10 + l1.data) % MOD;
            l1 = l1.next;
        }

        // Traverse the second linked list (l2) and calculate the number
        while (l2 != null) {
            num2 = (num2 * 10 + l2.data) % MOD;
            l2 = l2.next;
        }

        // Multiply the two numbers modulo MOD to prevent overflow
        num3 = (num1 * num2) % MOD;
        return num3;
    }
}
}
