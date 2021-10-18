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
    public boolean hasCycle(ListNode head) {
        ListNode slow;
        ListNode fast;
        
        ListNode dummy=new ListNode();
        dummy.next = head;
        slow=dummy;
        fast=dummy;
        boolean flag= false;
        
        while(fast != null && fast.next!= null)
        {
            fast = fast.next.next;
            slow=slow.next;
            if(slow == fast){
               return true;
            }
        }
        return false;   
    }
}