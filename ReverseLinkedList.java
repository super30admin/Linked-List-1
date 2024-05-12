// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/*
 * Problem:206
 * Start with prev as null; curr = head
 * while curr != null; store the curr.next into temp.. and assign curr.next to prev;
 * then set prev=curr & curr = the next node stored in temp.
 * 
 * return prev which is the reversed linkedlist
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }
}