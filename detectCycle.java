// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
/*Approach - here, we have to detect the starting node of the cycle in the linkedlist if present. we have used slow and fast pointer where the fast
pointer goes twice the slow and they both meet at a certain point only if the cycle/loop is present else they don't meet.
Once they met, we have to reinitialize slow to the head and start moving both the pointers by one. Now, once again they meet at the point where the
cycle begins.*/


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
        if(head==null)
            return head;
        boolean hasCycle=false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null ) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                hasCycle=true;
                break;
            }

        }
        if(hasCycle==false)
            return null;
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}