// Time Complexity : O(n) 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
public class FindCycleInLinkedList {
    public ListNode detectCycle(ListNode head) {
        //null check
        if( head == null ) return null;
        
        ListNode slow = head; ListNode fast = head; //initializing
        boolean flag = false;
        
        while( fast != null && fast.next != null ) {
            slow = slow.next; //1x speed
            fast = fast.next.next; //2x speed
            
            if( slow == fast ) { //slow is meeting fast 
                flag = true; //set flag to true
                break;
            }
        }
        
        if(!flag) return null; //if flag is false means no cycel
        
        fast = head; //resetting
        
        while( slow != fast ) { //until there are not met
            slow = slow.next; //move ahead by1
            fast = fast.next; //move ahead by1
        }
        return slow; 
    }
}