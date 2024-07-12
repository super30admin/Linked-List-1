// Time Complexity : O(n)
// Space Complexity : O(n) -> recursive stack memory
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        return helper(curr);
    }

    public ListNode helper(ListNode head) {

        if (head == null || head.next == null) // we dont want to process last null, so check head.nxt not null
            return head;
        ListNode end = helper(head.next); // the last node
        head.next.next = head;
        head.next = null; // remove extra pointer
        return end;
    }
}
