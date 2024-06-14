/*
    LC - 19. Remove Nth Node From End of List
    TC - o(n)
    SC - o(1)
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return head;
        }
        int count = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while(count <= n) {
            fast = fast.next;
            count = count + 1;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode temp = slow;
        slow = slow.next.next;
        temp.next = slow;

        return dummy.next;
    }
}