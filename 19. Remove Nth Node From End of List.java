// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode headCache = head;
        ListNode ahead = head;
        ListNode behind = head;

        while(ahead != null && n-- > 0){
            ahead = ahead.next;
        }

        while(ahead != null){
            behind = head;
            head = head.next;
            ahead = ahead.next;
        }

        if(head == behind) return head.next;

        behind.next = head.next;
        return headCache;

    }
}
