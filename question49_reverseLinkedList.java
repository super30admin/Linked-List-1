package LinkedList1;

public class question49_reverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /*
        Iterative Method:
            Time Complexity: O(n)
            Space Complexity: O(1)
    */
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            ListNode curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp = curr;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
