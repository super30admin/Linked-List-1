// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes


// Your code here along with comments explaining your approach
// Since it is Linked List, we can got access elements by index and swap them. Instead, we need to keep pointer to
// prev node, current node and next node. To reverse, we need next.next to point to current node. Once we do that,
// we update the pointers to point to next node, like next becomes next.next, current pointer becomes next pointer and
// prev pointer becomes the current pointer.

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
