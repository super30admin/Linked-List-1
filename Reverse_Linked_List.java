
// Time Complexity :O(n)
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
    public ListNode reverseList(ListNode head) {
    ListNode current= head,prev=null,temp;
    
    while(current!= null){
        
        temp = current.next;
        current.next = prev;
        prev = current;
        current = temp;
    }   
        return prev;
        
    }
}
