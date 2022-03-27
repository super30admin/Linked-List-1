// Time Complexity : O(n) where n is the no.of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// CODE 
//fast=2*slow
//fast = a+2b+c ; slow = a+b
//=> a+2b+c = 2(a+b) => a=c
//=> distance from head of the linked list to the head of the cycle (a) is equal to the distance where they have met to the head of cycle(c)


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
        //null case
        if(head == null) return null;
        
        //finding meeting point
        ListNode slow = head;
        ListNode fast = head;
        
        Boolean flag = false; //flag variable to check  whether cycle exists or not
        //moving slow by one step and fast by two steps ; if slow and fast meets then there is a cycle
        while(fast!= null && fast.next!=null){
            fast= fast.next.next;
            slow = slow.next;
            
            if(slow==fast){  //if cycle is detected
                flag = true;
                break;
            }
        }
        if(!flag) return null;  //if there is no cylce i.e. flag == false
        
        //finding head of cycle
        //setting fast as head and moving both ptrs by one step as a=c
        fast = head;
        while(slow!=fast){
            fast = fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
