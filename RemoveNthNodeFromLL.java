// Approach : Brute Force Approach - Traverse the LL and get the count of the nodes.  In the second traverse go to the node (count - n) and
// remove the next node. 
// Time : O(2n)
// Space: O(1)

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
 // Approach : In one pass prepare the count while doing so keep moving your pointer so that gap between fast and slow will remain as n.
 // Now if you traverse through the gap then slow pointer will end up on previous to node that we wanted to remove.

 // Time : O(n)
 // Space : O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        dummy.next = head; // make the connection between dummy node and head
        int count = 0;

        // Below keeps slow and fast pointer at a distance of n;
        while(count<=n){
            count++;
            fast=fast.next;
        }

        // check where fast landed. now move slow and fast
        while(fast!=null){
            slow = slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        
        return dummy.next; // return head
    }
}