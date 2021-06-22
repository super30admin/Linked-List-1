// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We solve this by using 3 pointers
// prev, curr and tempNext
class ReverseLinkList {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        ListNode prev = null, curr = head, tempNext = head.next;

        while (tempNext != null) {
            curr.next = prev;

            prev = curr;
            curr = tempNext;
            tempNext = tempNext.next;
        }

        // to link last node which will be new head
        curr.next = prev;

        return curr;
    }
}