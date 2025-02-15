// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

public class ReverseLLRecursion {
    ListNode result;
    public ListNode reverseList(ListNode head) {
        helper(head, null);
        return result;
    }

    private void helper(ListNode curr, ListNode prev) {
        // base
        if (curr == null) {
            result = prev;
            return;
        }

        // logic
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;

        helper(curr, prev);
    }
}
