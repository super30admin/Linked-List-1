// Time Complexity: O(m) where m is the number of nodes
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy_head = new ListNode(0);
        dummy_head.next = head;

        ListNode fast = dummy_head;
        ListNode slow = dummy_head;

        for(int i = 1; i <= n+1; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy_head.next;
    }
}
