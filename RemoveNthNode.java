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
        if(head == null) return head;

        ListNode dummy = new ListNode(-1);
        ListNode slower = dummy;
        slower.next = head;
        ListNode slow = head;
        ListNode fast = head;

        int count = 1;
        while(count < n){
            fast = fast.next;
            count = count + 1;
        } 

        while(fast.next != null){
            slower = slow;
            slow = slow.next;
            fast = fast.next;
        }

        slower.next = slow.next;

        if(slower == dummy) 
            head = slower.next;

        return head;
    }
}
