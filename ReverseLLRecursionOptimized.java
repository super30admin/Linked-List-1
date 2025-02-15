// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

public class ReverseLLRecursionOptimized {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = reverseList(head.next);
        head.next.next = head; // Reversing the link
        head.next = null; // // Making the current node the last node
        return result;
    }
}
