// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode slow = dummy, fast = dummy;
        dummy.next = head;
        int i = 0;
        
        while(i <= n) {
            fast = fast.next;
            i++;
        }
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}