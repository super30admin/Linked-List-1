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

// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Since it is reversing a list, once we point the curr.next to prev, we will lose the reference to the next node. Hence we need to store the next node in a temp variable.
 * Now make the current node as previous node and move th current node to the reference stored in temp.
 * Repeat the same until curr becomes null.
 * Finally return prev as it will be the new head of the reversed list.
 */

class reverseList {
    public ListNode reverseList(ListNode head) {

        ListNode dummy=null;
        ListNode curr=head;
        ListNode prev=dummy;
        while(curr!=null)   
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }

        return prev;
        

    }
}