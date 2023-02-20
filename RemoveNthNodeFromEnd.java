// TC: O(n)
// SC: O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode curr = head;
        while(n > 0) {
            curr = curr.next;
            n--;
        }
        ListNode prev = dummy;
        ListNode nPtr = head;
        while(curr != null) {
            curr = curr.next;
            nPtr = nPtr.next;
            prev = prev.next;
        }
        prev.next = nPtr.next;
        nPtr.next = null;
        return dummy.next;
    }
}