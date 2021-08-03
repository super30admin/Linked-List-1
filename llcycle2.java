

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
         if(head == null)
             return head;
         
         //detect cycle
         boolean cycle = false;
         ListNode slow = head,fast = head;
         while(fast!=null && fast.next !=null){
             slow = slow.next;
             fast = fast.next.next;
             if(slow == fast){
                 cycle = true;
                 break;
             }
         }
         //find the start of cycle
         if(cycle){
             slow = head;
             while(slow!=fast){
                 slow = slow.next;
                 fast = fast.next;
             }
             return slow;
         }
         return null;
     }
    
}