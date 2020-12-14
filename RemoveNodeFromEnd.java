// Time Complexity :O(N) where n is the number of nodes 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: maintaing two pointers slow and fast where we start iterating the slow 
// after fast has moved n nodes.When fast reaches null we, move the next pointer of slow  to the next next pointer, thus skipping the
// desired the node.
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
        if(head==null || head.next==null)
            return null;
        ListNode dummy = new ListNode(-1);
        ListNode slow =dummy, fast = dummy;
        dummy.next=head;int i=0;
        while(i<=n){
            fast=fast.next;
            i++;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next =slow.next.next;
        
    return dummy.next;
    }
}