// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :no

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class SolutionTwo {
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        ListNode dummy=new ListNode(-1);

        dummy.next=head;

        ListNode slow=dummy;

        ListNode fast=dummy;

        int count=0;


        while(count<=n)
        {
            fast=fast.next;
            count++;
        }

        count=0;

        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;

        return dummy.next;
    }
}