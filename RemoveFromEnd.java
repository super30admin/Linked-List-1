// Time Complexity : O(N) where N is the number of nodes in the linked list
// Space Complexity :O(1) as we are using constant space
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// We will use two pointers, slow and fast.
// We will move the fast pointer n steps ahead of the slow pointer. 
// Then we will move both pointers one step at a time until the fast pointer reaches the end of the list.
// At this point, the slow pointer will be at the node just before the node we want to delete.
// We will then delete the node by changing the next pointer of the slow pointer to skip the node we want to delete.
// Finally, we will return the head of the modified list.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        // move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // move both until fast reaches end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // delete node
        slow.next = slow.next.next;

        return dummy.next;
    }
}