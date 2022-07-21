/**
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode previous = null;
        ListNode current = head;
        ListNode fast = head.next;

        while (fast != null) {
            current.next = previous;
            previous = current;
            current = fast;
            fast = fast.next;
        }
        current.next = previous;

        return current;
    }
}

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}