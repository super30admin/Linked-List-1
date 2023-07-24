package LinkedListI;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null)
        {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }

    /*

    // Time Complexity : O(n)
    // Space Complexity : O(n)
    // Did this code successfully run on Leetcode : Yes

    public ListNode reverseList(ListNode head) { // using recursion

        if(head == null || head.next == null) return head;

        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;

    }
     */
}
