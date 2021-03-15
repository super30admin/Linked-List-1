// Problem1 (https://leetcode.com/problems/reverse-linked-list/)
// Time Complexity : O(n)
// Space Complexity : O(1)
public class reverseLinkList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
