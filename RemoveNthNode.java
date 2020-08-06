// Time Complexity : O(N) where N is number of nodes in LL
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We do not know the end of linked list, so we need to have a fast pointer that reaches the end of LL. I will move
// the fast pointer, n nodes ahead of slow pointer. After that, we increment fast and slow one at a time. Once fast pointer
// reaches last node, the slow pointer points to node to be deleted. So, I delete the node that slow is pointing to and return the
// head of the LinkedList.
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode fast = dummy;
        ListNode slow = dummy;

        while (n != 0) {
            fast = fast.next;
            n--;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}
