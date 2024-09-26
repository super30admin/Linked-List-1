// Time Complexity : O(n) --> where n is length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode (206): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode head) {
        // head
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        
        while (fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}