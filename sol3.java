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
 
 //TC: O(N)
 // SC: O(1)
 
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // First check to see of a cycle in the linked list -- Two pointer technique
        // If there is a cycle then initalise one node to the start of the list and iterate till two 
        // pointers meet
        
        //Check if there is a loop
        ListNode slow = head;
        ListNode fast = head;
        boolean loop = false;
        while(fast!=null && fast.next!=null){
            fast= fast.next.next;
            slow=slow.next;
            if(fast==slow){
                loop=true;
                break;
            }
        
        }
        
        slow = head;
        if(loop == false)
            return null;
        else{
            while(slow!=fast){
                fast=fast.next;
                slow=slow.next;
            }
            return slow;
            
            
        }
        
        
        
        
    }
}
