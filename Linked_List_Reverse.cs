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
            if (head == null) return head;
            ListNode prev = null;
            ListNode current = head;
            ListNode fast = head.next;
            while (fast != null)
            {
                current.next = prev;
                prev = current;
                current = fast;
                fast = fast.next;
            }
            current.next = prev;
            return current;

        }

        public ListNode ReverseList_Recursive(ListNode head)
        {
            if (head == null || head.next == null) return head;

            ListNode reversed = ReverseList_Recursive(head.next);
            head.next.next = head;
            head.next = null;
            return reversed;
        }
    }
}
