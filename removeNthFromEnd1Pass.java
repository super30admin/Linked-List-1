/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// One pass approach is instead of finding the target index and traversing again
// we can use ListNode slow itself to start moving once fast listNode has already reached
// n steps. When we reach that point, we can reassign next pointer of slow pointer and
// return the initial head.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        ListNode slow = start; ListNode fast = start;
        slow.next = head;
        for(int i=1; i<=n+1; i++) {
            fast = fast.next;
        }
        while(fast!=null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}