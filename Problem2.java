// Time Complexity : O(n)
// Space Complexity : O(1)
    // n is the number of nodes present in the linked list.

// Your code here along with comments explaining your approach
    //We use 2 pointers, slow and fast. We also use a dummy pointer to be able to delete the head node.
    //The fast pointer traverse "n+1" number of nodes. Then slow and fast both traverse until "fast" pointer reaches null. 
    //Now the slow has reached the required node's previous node. We can delete the required node by making the "slow.next" point to the next of required node.
    
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
        for (int i=0; i<=n; i++)
        {
            fast = fast.next;
        }
        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}