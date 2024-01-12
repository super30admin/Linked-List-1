public class DetectCycle {
    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    // TC: O(N) where N is length of linked list
    // SC: O(1)
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        boolean isCycleFound = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycleFound = true;
                break;
            }
        }
        if (isCycleFound) {
            fast = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        return null;
    }
}
