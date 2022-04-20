public class Problem2 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    // Time Complexity :  o(n)
    // Space Complexity : 0(1)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int counter = 0;

        while (fast != null) {
            if (counter > n) {
                slow = slow.next;
            }
            fast = fast.next;
            counter++;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}
