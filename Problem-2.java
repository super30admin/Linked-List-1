// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We maintain 2 pointers such that the gap between 2 pointers will be 'n'
// To deal with corner cases we use dummy node 
class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        int count = 0;
        while (fast.next != null) {
            fast = fast.next;
            count++;
            if (count > n) {
                // when gap of n is reached then start moving slow
                slow = slow.next;
            }
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}