// Time Complexity : O(n) --> where n is length of linked list
// Space Complexity : O(n)
// Did this code successfully run on Leetcode (206): Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode head) {
        // base
        if (head == null || head.next == null) return head;
        
        // logic
        ListNode rev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }
}