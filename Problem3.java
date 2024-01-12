// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO


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
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
              fast = fast.next.next;
              slow = slow.next;   
              if(slow == fast){
                  flag = true;
                  break;
              }
        }
        if(!flag) return null;
        slow = head;  //if there is a cycle
        while(slow != fast){
              slow = slow.next;
              fast = fast.next;  
        }
        return slow;
    }
}