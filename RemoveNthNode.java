// Time Complexity : O(n) where n is the number of nodes in the linked list
// Space Complexity : O(1) as we are using constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
// Approach: We will use two pointers, slow and fast. We will move fast pointer n times. Then we will move both pointers until fast pointer reaches the end of the list. The slow pointer will be at the node to be deleted. We will delete the node by changing the next pointer of slow pointer to next of next of slow pointer. We will return the head of the list.
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
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = dummy;
        ListNode slow = dummy;

        // move fast pointer n times
        int count = 0;
        while(count <= n){
            count++;
            curr = curr.next;
        }

        // move both pointers
        while(curr != null){
            slow = slow.next;
            curr = curr.next;
        }


        // delete the node
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;

    }
}
