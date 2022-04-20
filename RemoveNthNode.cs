using System;
using System.Collections.Generic;
using System.Text;

namespace LinkedList
{
    public class RemoveNthNode
    {
        public ListNode RemoveNthFromEnd(ListNode head, int n)
        {

            if (head == null || head.next == null)
                return null;

            ListNode Dummy = new ListNode(-1);
            Dummy.next = head;

            ListNode slow = Dummy;
            ListNode fast = Dummy;
            int count = 0;

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

            slow.next = slow.next.next;

            return Dummy.next;
        }
    }

   
}
