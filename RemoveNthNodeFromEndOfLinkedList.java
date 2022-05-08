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
        
        if(head.next==null){
            return null;
        }
        
        ListNode node = null;
        ListNode prev = null;
        ListNode dummy = new ListNode(-1,head);
        head = dummy;
        ListNode curr = head;
        int count =1;
        
        while(curr.next!=null){
            if(count==n){
                node = head;
            }
            if(count==n+1){
                prev = head;
            }
            curr = curr.next;
            if(node!=null){
                node = node.next;
            }
            if(prev!=null){
                prev = prev.next;
            }
            count++;
        }
        if(prev==null){
            prev = dummy;
        }
        prev.next = node.next;
        node.next = null;
        return dummy.next;
    }
}