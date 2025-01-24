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
    public ListNode RemoveNthFromEnd(ListNode head, int n)
    {
        if (head == null)
        {
            return null;
        }
        ListNode dummyNode = new ListNode(-1, head);
        ListNode current = dummyNode;
        ListNode slow = dummyNode;
        int count = n;
        while (current != null && count >= 0)
        {
            current = current.next;
            count--;
        }
        while (current != null)
        {
            current = current.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }
}