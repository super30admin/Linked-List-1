//Time Complexity: O(N) where N is the number of nodes
//Space complexity constant
public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }
        ListNode current = new ListNode(-1, head);
        ListNode prev = current;
        ListNode ans = prev;

        int count = 0;
        while (count <= n) {
            current = current.next;
            count++;
        }

        while (current != null) {
            current = current.next;
            prev = prev.next;
        }

        if (prev.next.next == null) {
            prev.next = null;
        } else {
            prev.next = prev.next.next;
        }

        return ans.next;

    }
}
