public class ReverseLinkedList {
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
    // SC: O(1) in iteration and O(N) in recursion
    public ListNode reverseList(ListNode head) {
        // return reverseListIteration(head);
        return reverseListRecursion(head);
    }

    private ListNode reverseListRecursion(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode reversed = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }

    private ListNode reverseListIteration(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        return prev;
    }
}
