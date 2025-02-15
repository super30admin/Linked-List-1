// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// iterating through the list and reversing the direction of the next pointers one by one.

// Your code here along with comments explaining your approach

public class ReverseLL {
    public ListNode reverseList(ListNode head) {
        if ( head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
