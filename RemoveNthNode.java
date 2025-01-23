// TC: O (m) where m is number of nodes in the list
// SC: O (1)

/*
 * First make a pointer ptr1 go to the (n+1)th node in the list
 * Then start a second pointer ptr2 from head, while the first pointer goes to the end:
 * when ptr1 goes from n+1 to l, ptr2 will go from 0 to (l - n), i.e., (n-1)th node from end
 * Delete the node after ptr2, the nth node in the list.
 */
public class RemoveNthNode {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ptr1 = head;
        int i;
        // start first pointer to go to (n+1)th node in the list
        for (i = 1; i <= n + 1; i++) {
            if (ptr1 == null) {
                // we have reached the end, i.e. n = size of list, i.e., the head is to be deleted
                head = head.next;
                return head;
            }
            ptr1 = ptr1.next;
        }
        // when ptr1 goes from n+1 to l, ptr2 will go from 0 to (l - n), i.e., (n-1)th node from end
        // (where l = size of list)
        ListNode ptr2 = head;
        while (ptr1 != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        if (ptr2.next == null) return null; // only one node in list
        ptr2.next = ptr2.next.next; // "delete" node after ptr2 by bypassing it
        return head;
    }
}
