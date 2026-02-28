// Two pointers O(n) time, O(1) space
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while (count <= n) {
            fast = fast.next;
            count++;
        }
        // after loop we have difference of n between slow and fast

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next; // deleting by skipping node and reassigning to node after

        return dummy.next; // return head which is node to remove
    }   
}

