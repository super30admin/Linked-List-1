/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public ListNode DetectCycle(ListNode head) {
        ListNode fast =head;
    ListNode slow = head;
    bool iscycle= false;
        if(head==null){
            return null;}
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                iscycle = true;
                break;
            }
        }
        if(!iscycle)
        {
            return null;
        }
        
        slow = head;
        while(slow!=fast)
        {
            slow= slow.next;
            fast=fast.next;
        }
        
        return fast;
        
    }
}
