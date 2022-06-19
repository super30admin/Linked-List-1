// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//19. Remove Nth Node From End of List
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(-1);
        temp.next = head;
        // if(head.next == null) return null;
        int count = 0;
        ListNode slow = temp;
        ListNode fast = temp;
        while (count < n) {
            fast = fast.next;
            count++;
        }
        System.out.println(fast.val);
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        System.out.println(slow.val);
        slow.next = slow.next.next;
        return temp.next;
    }
}
