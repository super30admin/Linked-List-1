// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes     
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
// we will be taking 2 pointer slow and fast .. slow will be moving one step where as fast will be moving 2 steps
// if they both meet then we have a loop. 
// the starting of the loop is equal distance from the start and the meeting point.
// so reset the slow to head and move the fast pointer and slow pointer till they meet. and return that element
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
    ListNode slow=head;
    ListNode fast=head; 
    boolean flag= true;
        if(head==null || head.next==null) return null;        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=false;
                break;
            }
                
        }
        if(flag) return null;
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}