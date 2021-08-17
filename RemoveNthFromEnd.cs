using System;
using System.Collections.Generic;
using System.Text;

namespace LinkedList
{
    class RemoveNthFromEndLC
    {
        // Definition for singly-linked list.
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

        public ListNode RemoveNthFromEnd(ListNode head, int n)
        {
            if (head == null)
            {
                return head;
            }
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode slow = dummy, fast = dummy;
            int cnt = 0;
            while (cnt <= n)
            {
                fast = fast.next;
                cnt++;
            }
            while (fast != null)
            {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return dummy.next;
        }
    }
}
