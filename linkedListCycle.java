// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode previous;
        ListNode current;
        ListNode next;
        previous = null;
        current = head;

        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
}
