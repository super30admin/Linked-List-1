using System;
namespace Algorithms
{
    /// Time Complexity : O(n) 
    // Space Complexity :O(1)
    // Did this code successfully run on Leetcode :Yes
    // Any problem you faced while coding this :  Referred Online
    public class Linked_List_Reverse
    {
        public class ListNode
        {
            public int val;
            public ListNode next;
            public ListNode(int val = 0, ListNode next = null)
            {
                this.val = val;
                this.next = next;
            }
        }

        public ListNode ReverseList(ListNode head)
        {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null)
            {
                ListNode tempNext = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tempNext;
            }
            return prev;

        }
    }
}
