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

//tc - o(n)
//sc-o(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        
        while(fast != null && fast.next !=null)
        {
        slow = slow.next;
        fast = fast.next.next;
         if(slow == fast) // got the cycle
         {
             flag = true;
             break;
         }   
        }
        if(!flag) return null;
        slow = head;
        while(slow!=fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
  
    }
}