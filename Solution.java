//Linked List Cycle II

//TC :O(n) 
//SC: O(1) //no seperate list is declared

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
        ListNode fast=head;
        ListNode slow=head;
        boolean flag=false;

        while(fast!=null && fast.next!=null) //chk if we reach end of list where there is no cycle
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast) //at point where they need
            {
                flag=true;
                break;
            }
        }    
        if(!flag) return null;//no cycle
        fast=head; //change any pointer to head
        while(fast!=slow)
        {
            slow=slow.next;
            fast=fast.next;
        }    
     return fast;//head of the cycle..   

    }
}