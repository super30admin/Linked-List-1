// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
    I maintain a dummy node which points to the head node and slow and fast which is equal to dummy at first. I increment fast = fast.next n number of times. Then until fast becomes the last node, I 
    increment both fast and slow by one node each. At the end, I set slow.next = slow.next.next (slow.next points to the node that needs to be deleted)
*/

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
        ListNode slow = dummy, fast = dummy;

        for (int i = 0; i < n; i++)
        {
            fast = fast.next;
        }

        while (fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode temp = slow.next;

        slow.next = slow.next.next;

        temp = null;

        return dummy.next;
    }
}