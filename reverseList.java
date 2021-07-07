// Time Complexity :O(n) n is the number of nodes
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode r = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return r;
        
    }
}