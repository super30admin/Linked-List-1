// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach - Use two pointers (fast and slow) and a dummy node.
//    - Move fast n+1 steps ahead.
//    - Then move both slow and fast one step at a time until fast reaches the end.
//    - Now slow is just before the node to remove → remove it.
//    - Return dummy.next as the new head of the list.

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveNthNodeFromEndInList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        int count = 0;

        while(count <= n) {
            fast = fast.next;
            count++;
        }

        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;   //mark deleted node's next to null for garbage collection

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        RemoveNthNodeFromEndInList remover = new RemoveNthNodeFromEndInList();

        System.out.print("Original List: ");
        printList(head);

        ListNode result = remover.removeNthFromEnd(head, 2);
        System.out.print("After removing 2nd node from end: ");
        printList(result);
    }
}
