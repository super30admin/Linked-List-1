/*
    LC - 206. Reverse Linked List
    TC - o(n)
    SC - o(n) - recursive stack space
*/

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode reversed = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}