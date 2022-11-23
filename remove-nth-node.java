//TC = O(n)
//SC = O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        // moving fast pointer to create gap between slow and fast
        while (count <= n) {
            fast = fast.next;
            count++;
        }

        // moving both at 1x speed to get to the correct position to delete
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}