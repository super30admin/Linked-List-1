// Time Complexity : O(n)
// Space Complexity : O(1)

package org.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

class Node {
    int val;
    Node next;
    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}

class SLL {
    Node head = new Node(4, new Node(11, new Node(13, null)));
    Node reversed;
    public void printLL() {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    public void reverseLL(Node root) {
        if (root == null || root.next == null) {
            this.reversed = root;
            return;
        }
        reverseLL(root.next);
        root.next.next = root;
        root.next = null;
    }
}

public class ReverseLL {
    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.reverseLL(ll.head);
        Node root = ll.reversed;
        while (root != null) {
            System.out.println(root.val);
            root = root.next;
        }

    }
}
