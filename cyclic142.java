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
/*
// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                slow  = head;;
                while(slow != fast){
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow;
            }

        }
        return null;
    }
}