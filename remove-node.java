//Time Complexity: O(n)
//Space Complexity:o(1)
//Did this code successfully run on Leetcode :Yes
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = n;
        ListNode start = head;
        ListNode end = head;

        while (count != 1) {
            end = end.next;
            count--;
        }
        ListNode prev = head;
        while (end.next != null) {
            prev = start;
            start = start.next;
            end = end.next;
        }
        if (start == head) {
            return head.next;
        } else {
            prev.next = start.next;
            start.next = null;
        }
        return head;
    }
}
