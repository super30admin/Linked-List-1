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
        //if(ListNode head == null) return new ListNode;
        ListNode slow = head;
        ListNode fast = head;
        int flag = 0;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            // if slow and fast nodes meet
            if(slow == fast){
                flag = 1;
                break;
            }
        }
        if(flag == 0) return null;
        if(flag == 1){
            //start slow pointer as the head to find the start of the cycle 
            slow = head;
            
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
                 
        }
       return fast; 
    }
}
