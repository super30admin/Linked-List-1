// Time Complexity : O(n), where n is the number of nodes in the linked list
// Space Complexity : O(1), as we use constant extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// This solution uses the two-pointer technique to remove the Nth node from the end of the linked list.
// A dummy node is added before the head to handle edge cases (e.g., deleting the head node).
// First, move the fast pointer `n+1` steps ahead so that the gap between fast and slow becomes `n`.
// Then move both fast and slow pointers until fast reaches the end.
// At that point, slow will be just before the node to remove. We adjust pointers to remove it.
// Finally, return `dummy.next` as the new head of the list.


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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;

        //Move the fast pointer till distance between fast and slow is n
        while(count <= n){
            count++;
            fast = fast.next;
        }

        //Now move both pointers till fast becomes null
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        //Remove the nth node form end
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;

        //Return head
        return dummy.next;
    }
}