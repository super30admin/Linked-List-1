// Time Complexity : O(L), where L = length of linked list (we traverse the list twice at most).
// Space Complexity : O(1), since we only use a few pointers.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//
// Approach : 
// Use two-pointer technique (fast & slow). 
// 1. Place both pointers at a dummy node before head. 
// 2. Move fast pointer n+1 steps ahead so that gap between fast and slow = n. 
// 3. Move both fast and slow together until fast reaches the end. 
// 4. Now slow is just before the node to be removed. Adjust slow.next to skip that node. 
// This avoids calculating length of list separately.

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // dummy node to handle edge cases (like removing head)
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        // move fast n+1 steps ahead
        while (count <= n) {
            fast = fast.next;
            count++;
        }

        // move both pointers until fast reaches end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // now slow is before the node to delete
        slow.next = slow.next.next;

        // return new head (might be different if head was removed)
        return dummy.next;
    }
}


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
