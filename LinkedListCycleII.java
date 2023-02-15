// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

/**
 * Use slow & fast pointer technique to find if there is a
 * cycle. if so, then take two pointers starting from head and another from
 * slow. Iterate until both are equal and return either of them. If not,
 * return null.
 *
 */
class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                ListNode ptr1 = slow, ptr2 = head;
                while(ptr1 != ptr2) {
                    ptr1 = ptr1.next;
                    ptr2 = ptr2.next;
                }
                return ptr1;
            }
        }
        return null;
    }
}