// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
/* Approach : Here we have maintained a dummy pointer and assign dummy.next to the head. we have used slow and fast pointers pointing to the dummy
node initially and we kept increment fast by one until count is equal to the nth value given in the question. once count is 0 we started to
move slow pointer and fast pointer by one until fast reaches null. In this way we have positioned our slow to the one element before the nth
 node for deletion from end and done slow.next=slow.next.next; to delete the nth element from end.*/


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
        if(head==null)
            return head;
        ListNode dummy=new ListNode();
        dummy.next=head;
        int count=0;
        ListNode fast=dummy;
        ListNode slow=dummy;
        while(count<=n&&fast!=null){
            fast=fast.next;
            count++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}