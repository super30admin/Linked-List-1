// TC: O (n)
// SC: O (1)

/*
 * For each node, maintain 3 pointers. A next pointer for the next node,
 * a prev pointer for the prev node, and a curr pointer for the current node.
 * Set next to curr.next, ptr.next to prev, then move prev to curr, and curr to next
 */
public class ReverseLinkedList {
    /**
     * Definition for singly-linked list.
     */
    public class ListNode {
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

    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
