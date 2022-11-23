//SC is o(1)
//TC is O(n)
class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;

        while (fast != null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }

        curr.next = prev;

        return curr;

    }
}