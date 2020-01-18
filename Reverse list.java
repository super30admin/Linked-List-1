// Time complexity 0(n)
// space complexity 0(1)
// Executed successfully in leetcode.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // edge case
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode fast = head.next;
        while(fast!=null){
            current.next = prev;
            prev = current;
            current = fast;
            fast = fast.next;
        }
        current.next = prev;
        return current;
        
        
    }
}