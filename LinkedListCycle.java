// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
    
        if(head==null || head.next==null) return null;
       ListNode slow = head;
       ListNode fast = head;

       while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow==fast){
            break;
        }
       }

       if(fast==null || fast.next==null) return null;
       else{
        fast = head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
       } 
       return slow;
    }
}