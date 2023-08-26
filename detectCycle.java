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
// Time Complexity: O(n)
// Space Complexity: O(1)
// Runs on Leetcode:  yes
public class Solution {

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
               flag  = true;
               break;
            }
        }
        if (!flag) return null;
         slow = head;
         while(slow != fast){
                slow = slow.next;
                fast = fast.next;
         }
        return slow;
    }
}