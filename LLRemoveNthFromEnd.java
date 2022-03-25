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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //to handle edge cases, put a dummy head
        ListNode dummy = new ListNode(-1);

        ListNode slow = dummy;
        ListNode fast = dummy;

        dummy.next = head;


        //if we want to remove a node, we have to stand one node behind it
        int count=0;

        //so we take 2 pointers, and maintain a gap of k between them
        while(count < n)
        {
            fast = fast.next;
            count++;
        }

       //increment both at 1x till fast reaches end
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        //slow is now one node behind the node to be removed
        slow.next = slow.next.next;

        //return head
        return dummy.next;

    }
}
