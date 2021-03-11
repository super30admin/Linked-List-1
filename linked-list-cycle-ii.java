// Time Complexity :
O(n) 
// Space Complexity :
O(1) as it just uses pointers
// Did this code successfully run on Leetcode :
Yes
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
        
   
        
        //Define two pointers slow and fast
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        
        if(fast==null || fast.next==null) return null;
        
        slow = head;
        
        while(slow != fast){
            slow = slow.next;
            fast=fast.next;
        }
        
        return fast;
        
    }
}