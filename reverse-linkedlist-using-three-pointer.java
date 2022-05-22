class Solution {
    // Solution using three pointer
    // Time complexity is O(n)
    // Space complexity is O(1)
    // This solution is submitted on leetcode with no error
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
        val = x;
        next = null;
        }
    }
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
        while(fast!=null) {
            curr.next = prev;
            prev = curr; // prev job done
            curr = fast; // slow job done
            fast = fast.next; // fast job done
        }
        curr.next = prev;
        return curr;
    }
}