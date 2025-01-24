/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution
{
    public ListNode ReverseList(ListNode head)
    {
        if (head == null)
        {
            return null;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next = head.next;

        while (next != null)
        {
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }

        current.next = prev;
        return current;
    }
}