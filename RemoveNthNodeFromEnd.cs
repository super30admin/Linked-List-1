// time complexity - O(n)
// space complexity -  O(1)
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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int count = 0;
        ListNode slow = dummy;
        ListNode fast = dummy;

        while (count <= n)
        {
            fast = fast.next;
            count++;
        }

        while (fast != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        ListNode tmp = slow.next;
        slow.next = slow.next.next;
        tmp.next = null;

        return dummy.next;
    }
}