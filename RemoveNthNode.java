// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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

        if(head == null ) return null;
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;

        ListNode slow = dummyNode;
        ListNode fast = dummyNode;
        int i = 0;
        while(i <= n) { //fast pointer n steps ahead
            fast = fast.next;
            i++;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        //At this point slow pointer is at length - nth index.

        if(slow.next != null)
            slow.next = slow.next.next;


        return dummyNode.next;

    }
}
