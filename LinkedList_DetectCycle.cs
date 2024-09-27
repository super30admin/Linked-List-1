using System;
using System.Collections.Generic;
using static Algorithms.Linked_List_Reverse;

namespace Algorithms
{
    public class LinkedList_DetectCycle
    {
        /// Time Complexity : O(N) 
        // Space Complexity :O(1) 
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Based on class
        public ListNode DetectCycle(ListNode head)
        {
            if (head == null) return null;

            ListNode slow = head;
            ListNode fast = head;
            bool isIntersected = false;

            while (fast != null && fast.next != null)
            {
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast)
                {
                    isIntersected = true;
                    break;
                }
            }
            if (!isIntersected) return null;
            slow = head;

            while (slow != fast)
            {
                slow = slow.next;
                fast = fast.next;
            }

            return slow;
        }

        /// Time Complexity : O(N) 
        // Space Complexity :O(N) 
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Based on class
        public ListNode DetectCycleSet(ListNode head)
        {
            if (head == null) return null;

            HashSet<ListNode> visited = new HashSet<ListNode>();

            ListNode node = head;
            while (node != null)
            {
                if (visited.Contains(node))
                {
                    return node;
                }
                visited.Add(node);
                node = node.next;
            }
            return null;
        }
    }

}
