using System;
using System.Collections.Generic;
using System.Text;

namespace LinkedList
{
    class ReverseLinkedListLC
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
        public ListNode ReverseList(ListNode head)
        {
            if (head == null)
            {
                return head;
            }
            ListNode prev = null, curr = head, fast = curr.next;
            while (fast != null)
            {
                curr.next = prev;
                prev = curr;
                curr = fast;
                fast = fast.next;
            }
            curr.next = prev;
            return curr;
        }
    }
}
