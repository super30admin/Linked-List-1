// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++)
            fast = fast.next;

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next;

    }
}