// Time complexity - O(n)
// space complexity - O(constant)
// Works on leet code

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        while(curr != null){
            // store next pointer
            next = curr.next;
            // Remove link from next to prev
            curr.next = prev;
            // move previous and current pointer
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
