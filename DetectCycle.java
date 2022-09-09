/**
## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)
 
Time Complexity :   O (N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (142. Linked List Cycle II)
Any problem you faced while coding this :       No
 */

// Input: head = [3,2,0,-4], pos = 1

public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        // base case
        if( head == null)
            return null;
        boolean flag = false;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){  // even and odd length case
            slow = slow.next;
            fast = fast.next.next;
            
            // when slow ==  fast, cycle is present
            if(slow == fast){
                flag = true;
                break;
            }
        }
        
        // No cycle present
        if(!flag)
            return null;
        
        // distance from head to cycle start == distance from fast to cycle start
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}