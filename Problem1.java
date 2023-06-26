// Time Complexity : O(n)
// Space Complexity : O(1)
    // n is the number of nodes present in the linked list.

// Your code here along with comments explaining your approach
    //We take 3 pointers, one for current node, one for next pointer, one for previous pointer. Initialize the "curr" pointer with head.
    //At every iteration, we first store the next node in the "next" pointer. We reassign the next of curr pointer with "prev" pointer.
    //We then reassign the "prev" pointer with "curr" pointer. Finally, we assign the "curr" with "next" pointer. We do this until "curr" is null. The "prev" pointer is the new head.
    
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
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}