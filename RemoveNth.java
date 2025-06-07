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
    Node root = new Node(10, new Node(14, new Node(7, new Node(3, new Node(1, null)))));
    void printSLL() {
        Node head = root;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    void removeNth(int n) {
        Node slow;
        Node fast;
        fast = new Node(-1, null);
        fast.next = root;
        slow = fast;
        int cnt = 0;
        while (cnt <= n) {
            fast = fast.next;
            cnt += 1;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    }
}

public class RemoveNth {
    public static void main(String[] args)
    {
        SLL ll = new SLL();
        ll.printSLL();
        ll.removeNth(2);
        ll.printSLL();
    }
}
