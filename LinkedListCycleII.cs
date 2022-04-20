using System;
using System.Collections.Generic;
using System.Text;

namespace LinkedList
{
    public class LinkedListCycleII
    {
        /*
         * T.C: O(N) traversing through all nodes in linked list
         * S.C: O(1) no extra space used
         */
        public ListNode DetectCycle(ListNode head)
        {
            if (head == null)
                return null;

            ListNode slow = head;
            ListNode fast = head;

            bool isMet = false;

            while (fast != null && fast.next != null)
            {
                slow = slow.next;
                fast = fast.next.next;

                if (fast == slow)
                {

                    isMet = true;
                    break;
                }
            }

            slow = head;

            if (isMet == false) return null;

            while (fast != slow)
            {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;

        }
    }
}
