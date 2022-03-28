/*
// Time Complexity : O(n)
// Space Complexity : O(!)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

*/

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution_remove {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);

        ListNode first = dummy;
        ListNode sec = dummy;
        dummy.next = head;
        // incrementing first till the value of n is true
        while (n-- >= 0) {

            first = first.next;
        }

        // so we have diffrence now we know we have traverse till first not equal to
        // null and then change pointer to next.next.
        while (first != null) {

            first = first.next;
            sec = sec.next;
        }
        sec.next = sec.next.next;

        return dummy.next;

    }
}
