using System;
using System.Collections.Generic;
using System.Text;

namespace LinkedList
{
    class DetectCycleLC
    {
        //Time Complexity: O(n)
        //Space Complexity:O(1)
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
        public ListNode detectCycle(ListNode head)
        {
            if (head != null || head.next != null)
                return null;
            ListNode fast = head, slow = head;
            while (fast != null && fast.next != null && slow != null)
            {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow)
                {
                    fast = head;
                    while (fast != slow)
                    {
                        fast = fast.next;
                        slow = slow.next;
                    }
                    return slow;
                }
            }
            return null;
        }
    }
}
