public class Problem3 {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) {
     * val = x;
     * next = null;
     * }
     * }
     */
    // Time Complexity :  o(n)
    // Space Complexity : 0(1)
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if (hasCycle) {
            slow = head;
        } else {
            return null;
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    static class ListNode {
        int data;
        ListNode next;

        ListNode(int d) {
            data = d;
            next = null;
        }
    }
}
