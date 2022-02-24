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

   
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Create 2 pointer slow and fast
//fast pointer would go 2 steps at a time and slowe one would go 1 step
// Run a loop till fast or its next are not null, if we found null return null as isare no cycle
// The pointers would meet at some points if there is a cycle
//Break at that point. start an fresh pointer from begining
// run till this pointer meets with fast pointer, this time we will increment both of them 1 step at a time.
//Return the point as we found the point from where the cycle begins.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null)
            return null;
        slow = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}