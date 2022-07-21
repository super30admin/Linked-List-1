/**
 * Time Complexity: O(N)
 * Space Complexity : O(1)
 */
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

public class RemoveNNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int counter = 0;
        while (counter <= n) {
            counter++;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
