// Time Complexity : O(n) where n is # nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach: maintain a slow and fast pointer, iterate over the list
// and keep incrementing both pointers, delete node by the operation
// slow.next = slow.next.next which points to one ahead of curr

// Definition for singly-linked list.
  
class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        
        ListNode fast = dummy;
        
        int i = 1;
        while (i <= n+1) {
            fast = fast.next;
            i++;
        }
        
        ListNode slow = dummy;
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // delete operation
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}