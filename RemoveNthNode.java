// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :

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

//We are using 2 pointer approach, first pointer will be n steps ahead of second.Both pointers move simultaneously
// until first reaches end node.  Then the second will be at the node-1 that needs to be removed.Use dummy node to
//handle edge cases

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1); //dummy node is needed for edge case when we need to remove last element.
        dummy.next = head;

        ListNode slow = dummy, fast = dummy;
        if(head.next==null) {
            return null;
        }
        int count = 0; //starting at 0 coz we want fast ptr 1 step ahead of difference n
        while(count <= n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        //Use a temp node to explicitly nullify the removed node
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null; //this will facilitate gc

        return dummy.next;
    }
}