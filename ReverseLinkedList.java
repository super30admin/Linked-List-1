/**
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;

        ListNode previous = null;

        while(head != null) {
            ListNode temp = head.next;
            head.next = previous;
            previous = head;
            head = temp;
        }
        return previous;
    }
}