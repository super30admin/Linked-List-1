/**
 * TC - O(n) where n is total number of nodes in linkedlist
 * SC - O(1)
 */
public class RemoveNthNodeFromEnd {

    private class ListNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;
        int count = 0;

        while(count < n) {
            fast = fast.next;
            count++;
        }

        ListNode slow = dummy;

        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if(slow.next == head){
            head = head.next;
        } else {
            slow.next = slow.next.next;
        }

        return head;
    }
}
