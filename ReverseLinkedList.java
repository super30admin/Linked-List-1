//https://leetcode.com/problems/reverse-linked-list/
/*
Time: O(n) where n is the number of nodes in the input
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class ReverseLinkedList {

    // prev (null) -> cur(head) -> next;
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
