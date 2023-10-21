// Time Complexity :O( n)
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
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode slow=dummy;
    ListNode fast = dummy;
        
    for(int i=0;i<n;i++){
        fast = fast.next;
    }
    // System.out.println(slow.val +"fast"+ fast.val);
    while(fast.next !=null){
        slow = slow.next;
        fast=fast.next;}
   
    slow.next = slow.next.next;
//    ListNode temp= slow.next;
//     slow.next = temp.next;    
//     temp.next = null;    
    
    return dummy.next;
}
}
