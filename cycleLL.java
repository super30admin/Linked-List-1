// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
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
            return null;
        
        ListNode slow = head, fast=head;
        boolean cycle =false;
        
        //detect cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }
        }
        
        //find the start node of the cycle
        if(cycle){
            slow = head;
            //keep updating the slow, fast pointer till they are equal
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            
            return slow;
        }
        
        return null;
    }
}