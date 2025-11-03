// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/description/

/**
 * Time Complexity: O(n) since we travel LL linearly
 * Space Complexity: O(1) since we don't use any auxillary space
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head;
        ListNode prev = null;

        // we reverse LL in place by maintaining a prev pointer
        // initially the prev pointer is null

        while(curr != null){
            ListNode temp = curr.next; // we store  the reference of next node since that would be out next curr
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}