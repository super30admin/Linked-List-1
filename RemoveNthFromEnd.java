/*
Time Complexity: O(N) where N is the number of nodes in the linked list.
Space Complexity: O(1) since we are using two pointers and not using any extra space.
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
Intuition : We can use two pointers, a slow pointer and a fast pointer. The fast pointer will move n steps ahead of the slow pointer. When the fast pointer reaches the end of the list, the slow pointer will be at the node before the one we want to remove. We can then remove that node by skipping it in the linked list.
*/

class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}