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
class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //base case
        if(head == null || n == 0) return null;

        //dummy node to handle deletion of head node
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        //establish the gap(n) between slow and fast pointers
        int count = 0;
        while(count <= n){
            count++;
            fast = fast.next;
        }

        //Move fast till it reaches null, and delete slow.next to remove nth node from the end
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}