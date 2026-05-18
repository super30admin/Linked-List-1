// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
    I use three pointers - slow, medium and fast. Slow and medium are set to null at first and fast = head. I traverse through the linked list while fast != null, I set slow = medium
    and medium = fast following which fast is set to next node. I then reverse the node that medium is pointing to by setting medium.next = slow. At the end of my traversal, 
    my new head pointer becomes medium.
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
    public ListNode ReverseList(ListNode head)
    {
        if (head == null)
        {
            return head;
        }

        ListNode slow = null, medium = null, fast = head;

        while (fast != null)
        {
            slow = medium;
            medium = fast;
            fast = fast.next;
            medium.next = slow;
        }

        return medium;
    }
}