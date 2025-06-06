// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : use floyd's tortoise hare problem. Fast pointer takes two steps at once, slow moves one step at a time.
// If there's a cycle in the linked list, they must meet at some point inside the loop.
// To detect head of cyle, reset fast pointer to head and move both slow and fast by one step. The node where they meet is head of cycle
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
        ListNode fast = head, slow = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(!flag){
            return null;
        }
        fast = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}