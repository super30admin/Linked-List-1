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
 
/* Time Complexity : O(n)
  *  n - lenghth of the linked list */
/* Space Complexity : O(1) */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        //Move the fp such that gap between sp and fp is equal to n - sliding window created
        while(count <= n){
            fast = fast.next;
            count++;
        }
        //Move the sliding window till the fp is at the last node
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        // the node next to the sp is the node to be removed
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;
        return dummy.next;
    }
}