// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        // base
        if (head == null || head.next == null)
            return head;

        // logic
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return reversed;

    }

}