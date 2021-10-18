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
        ListNode slow;
        ListNode fast;
        
        ListNode dummy = new ListNode();
        dummy.next = head;
        slow=dummy;
        fast=dummy;
        int count = 0;
        
        //create the appropriate gap of length n nodes
        while(count < n)
        {
            fast=fast.next;
            count ++;
        }
        //distance between slow and fast is of n nodes now
        //move each by one now
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}