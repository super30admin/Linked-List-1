// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

//19. Remove Nth Node From End of List (Medium) - https://leetcode.com/problems/remove-nth-node-from-end-of-list/
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
// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        
        while (count <= n) {
            fast = fast.next;
            count++;
        }
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        ListNode p1 = slow.next;
        slow.next = slow.next.next;
        p1.next = null;
        return dummy.next;
    }
}