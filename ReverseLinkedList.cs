using System;
using System.Collections.Generic;
using System.Text;

namespace LinkedList
{
    public class ReverseLinkedList
    {
        /*
         * T.C: O(N) : traversing through whole linked list
         * S.C: O(1): no extra space used
         */
        public ListNode ReverseList(ListNode head)
        {
            if (head == null || head.next == null)
                return head;

            ListNode prev = null;
            ListNode current =head;
            ListNode fast = head.next;

            while(fast!=null)
            {
                current.next = prev;
                prev = current;
                current = fast;
                fast = fast.next;
            }

            current.next = prev;

            return current;
        }
    }

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
}
