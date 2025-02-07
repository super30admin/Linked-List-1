// Approach: Maintain two pointers, slow and fast, both initially pointing to the head. First, move the fast pointer n steps forward. If
// fast becomes null at this point, it means we need to remove the head, so we return head.next. Otherwise, move both slow and fast one
// step at a time until fast reaches the last node of the list. At this point, slow.next is the node to be removed. To delete it, update
// slow.next to point to slow.next.next, effectively skipping the unwanted node.
// Time Complexity: O(n) where n - node count
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

public class RemoveNthNodeFromEnd {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int v) {
            val = v;
        }
    }

    // kth node from end is (n - k + 1)th node from beginning
    ListNode removeNthNodeFromEnd1(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        if (n == k) {
            return head.next;
        }
        temp = head;
        for (int i = 0; i < n - k - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }

    // fast pointer is k steps ahead of slow pointer
    ListNode removeNthNodeFromEnd2(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    void printLL(ListNode head) {
        if (head == null) {
            return;
        }
        while (head.next != null) {
            System.out.print(head.val + " -> " + "");
            head = head.next;
        }
        System.out.print(head.val + " -> NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd rnfe = new RemoveNthNodeFromEnd();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        int n = 2;
        System.out.println("List before removing kth node (k = " + n + ") from end..");
        rnfe.printLL(head);
        head = rnfe.removeNthNodeFromEnd2(head, n);
        System.out.println("List after removing..");
        rnfe.printLL(head);
    }
}