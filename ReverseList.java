public class ReverseList {
    class ListNode {
        int val;
        DetectCycle.ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
