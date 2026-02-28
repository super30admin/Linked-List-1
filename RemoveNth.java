public class RemoveNth {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    // Did this code successfully run on Leetcode : yes
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow  = dummy;
        ListNode fast  = dummy;
        if(head == null || head.next == null) {
            return null;
        }
        for(int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = slow.next.next;


        return dummy.next;

    }
}