public class RemoveNthNodeFromEnd {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    // TC: O(N) where N is length of linked list
    // SC: O(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // return removeNthFromEndTwoPass(head, n);
        return removeNthFromEndOnePass(head, n);
    }

    private ListNode removeNthFromEndOnePass(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    private ListNode removeNthFromEndTwoPass(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        int indexToBeRemoved = length - n;
        curr = head;
        if (indexToBeRemoved == 0) {
            return head.next;
        }
        while (indexToBeRemoved > 1) {
            curr = curr.next;
            indexToBeRemoved--;
        }
        curr.next = curr.next.next;
        return head;
    }
}
