// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

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

        //we bascially have to stand at each node and reverse its direction pointers

        if(head==null || head.next==null)
            return head;

        ListNode previous = null;
        ListNode current = head;
        ListNode fast = head.next;

        while(fast != null)
        {
            //here we lose the connection between 1->2 for ex., so we need fast to still have a connection to the next node in the list
            current.next = previous;
            //job of p done in line above so move it fwd
            previous = current;
            //job of c done in line above so move it fwd
            current = fast;
             //job of f done in line above so move it fwd
            fast = fast.next;
        }

        //for the last node
        current.next = previous;

        //head of reversed list
        return current;

    }
}
