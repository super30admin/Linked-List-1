// TIME: O(n)
// SPACE: O(1)
// SUCCESS on LeetCode

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            if (size == n) {
                return curr.next;
            }
            count++;
            if (count == size - n) {
                curr.next = curr.next.next;
                return head;
            }
            curr = curr.next;
        }
        
        return head;
    }
}
