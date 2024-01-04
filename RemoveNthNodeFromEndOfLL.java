// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow, fast, prev = null;
        slow = fast = head;

        int i = 1;

        while(i < n && fast != null)
        {
            i++;
            fast = fast.next;
        }

        while(fast.next != null)
        {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        if(prev == null) return slow.next;

        prev.next = slow.next;

        return head;
    }
}