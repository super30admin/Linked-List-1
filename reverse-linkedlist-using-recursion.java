class Solution {
    // Solution using recursion
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
        //base case
        if(head.next == null) return head;
        //logic
        ListNode reversed = reverseList(head.next);
        // pop happens
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}