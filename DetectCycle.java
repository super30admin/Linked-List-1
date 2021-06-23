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

// Time Complexity: O(n)
//Space Complexity: O(1)
//Leetcode: 142. Linked List Cycle II
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow=head;
        ListNode fast=head;
      
        while((fast!=null && fast.next!=null) )
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
            {
               
                break;
            }
        }
        //If there is no cycle
        if(fast==null || fast.next==null)
            return null;
        
        slow=head;
        
        while(slow!=fast)
        {
             
            slow=slow.next;
            fast=fast.next;
        }
       
        return slow;
    }
}