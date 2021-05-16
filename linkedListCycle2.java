// Space complexity - O(1)
// Space complexity - O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


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
        
        if(head == null || head.next == null){return null;}
        
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        while(fast != null && fast.next != null && flag != true){
            
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;
            
            if(fast == slow){
                
                flag = true;
            }
            
        }
        if(flag == false){
            
            return null;
        }
        fast = head;
        
        while(fast != slow){
            
            fast = fast.next;
            slow = slow.next;
        }
        
        return fast;
        
    }
}