// Time Complexity :O(n)
// Space Complexity :O(1)
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
        ListNode dummy_head = new ListNode(0);
        ListNode fast = dummy_head;
        ListNode slow = dummy_head;
        dummy_head.next = head;
        for(int i = 1; i<=n+1; i++)
        {
            fast = fast.next;
        }
        while (fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next =slow.next.next;
        return dummy_head.next;
    }
}