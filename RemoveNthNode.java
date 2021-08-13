//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
/*
Time: O(n) where n is the number of nodes in the input
Space: O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/
public class RemoveNthNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode first = new ListNode(-1); // dummy
        first.next = head;

        while (first != null && n-- > 0) {
            first = first.next;
        }

        ListNode second = new ListNode(-1);
        second.next = head;

        ListNode result = second; // store result to return result.next at the end

        ListNode prev = null; // prev follows second

        while (first != null && second != null) {
            first = first.next;
            prev = second;
            second = second.next;
        }

        prev.next = second.next;
        return result.next;

    }

}
