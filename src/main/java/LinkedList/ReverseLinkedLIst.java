package LinkedList;


/**
 *
 * Time Complextiy O(N)
 *
 * Recursive Solution Space : O(N)
 * Iterative Solution Space : Constant O(1)
 */
public class ReverseLinkedLIst {
    public static void main(String[] args) {
        ReverseLinkedLIst revLL = new ReverseLinkedLIst();

        ListNode head = new ListNode(5);
        head.next = new ListNode(6);
        head.next.next = new ListNode(7);
        head = revLL.reverseRecursively(head);
        revLL.printList(head);
        head = revLL.reverseRecursively(head);
        revLL.printList(head);

    }

    public void printList(ListNode head) {
        System.out.println("Reversed Linked List : ");
        ListNode temp = head;
        while( temp!= null ){
            System.out.print("Node : "+temp.val+ " ");
            temp = temp.next;
        }
        System.out.println( "\n");
    }

    // Recursive Function for Reversing a LL
    public ListNode reverseRecursively(ListNode node) {
        if(node== null || node.next == null) {
            return node;
        }
        ListNode head = reverseRecursively(node.next);
        node.next.next = node;
        node.next = null;
        return head;
    }


    public ListNode reverseIteratively(ListNode node) {
        if(node== null || node.next == null) {
            return node;
        }

        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }

        return prev;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
