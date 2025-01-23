// TC: O (n)
// SC: O (1)

/*
 * We use a mathematical formulation to show that when the slow and fast pointer meet,
 * if we reset one of the pointers to the head and continue the other, they will meet
 * again at the entry of the cycle. This is what we perform and return.
 */
public class LinkedListCycle2 {
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

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode ptr = head;
        ListNode fast = head;

        // if ptr and fast meet anywhere, there is a cycle.
        // Find this meeting point, or return null if they reach null first
        do {
            ptr = ptr.next;
            fast = fast.next.next;
            if (ptr == null || fast == null || fast.next == null) return null;
        } while (ptr != fast);

        // once they meet, reset ptr to head and continue fast
        // they will meet again at cycle entry point
        ptr = head;
        while(ptr != fast) {
            ptr = ptr.next;
            fast = fast.next;
        }
        return ptr;
    }
}
