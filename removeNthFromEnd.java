/**
 * Leetcode 19. Remove Nth Node From End of List
 * Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
 */
public class removeNthFromEnd {
    /**
     * Logic is to initially place 2 pointers n+1 nodes apart. move both pointers at same pace
     * until the fast/ahead pointer reaches end of list. We chose n+1 nodes apart initially so
     * that slow stops just before the node which needs to be deleted. now using slow we can easily
     * update its next to slow.next.next
     * To cover the scenario if we need to delete the first node in the list, we created a dummy and placed
     * ahead of the given list, using dummy we can easily delete the first node in the list
     *
     * TC: O(n) SC: O(1)
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;

        while (n != 0) { // place slow and fast n + 1 nodes apart
            fast = fast.next;
            n--;
        }

        while (fast != null) {//move both until fast reached end, we get slow just before the node which needs to be deleted
            slow = slow.next;
            fast = fast.next;
        }

        ListNode next = slow.next;
        if (next != null) {
            slow.next = next.next;
            next.next = null;
        } else {
            slow.next = null;
        }

        return dummy.next;
    }
}
