// Time Complexity : O(n)
// Space Complexity : O(1)

class Node {
    int val = 0;
    Node next = null;
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class SLL {
    Node head = new Node(10, new Node(12, new Node(14, new Node(20, null))));
    void createCycle() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head.next.next;
    }
    void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    SLL() {
        createCycle();
    }
}

public class DetectCycle {
    public static void main(String[] args) {
        SLL ll = new SLL();
        Node slow, fast;
        slow = ll.head;
        fast = slow;

        do {
            slow = slow.next;
            fast = fast.next.next;
        } while(slow != fast);

        fast = ll.head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.val);
    }
}
