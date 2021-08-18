/* Time Complexity : O(n)
   Space Complexity : O(1)  
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
*/
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
        if(head==null) return null;
        ListNode dummy=null, cur=head, fast=head.next;//three pointers and changing the pointers without extra space
        while(fast!=null){
            cur.next=dummy;
            dummy=cur;
            cur=fast;
            fast=fast.next;
        }
        cur.next=dummy;
        return cur;
    }
}