// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/**
 * Approach:
 * This problem is about detecting a cycle in a linked list and finding the node where the cycle begins.
 * I used the slow and fast pointer technique where the slow pointer moves one step at a time and the fast pointer moves two steps at a time.
 * If a cycle exists, the slow and fast pointers will meet, and then we reset the slow pointer to the head and move both pointers one step at
 * a time to find the starting node of the cycle. f no cycle is detected, the fast pointer will eventually reach the end of the list, and we return null.
 */

/*
 * We have 2 pointers - slow and fast. Slow moves by 1 and fast moves by 2. When slow and fast meet that means we have cycle.Then we make any(slow or fast)
 * point to head. This pointer and other pointer moves by 1. Place where they intersect is the start of cycle.
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class LLCycle2 {
    public ListNode detectCycle(ListNode head) {

        if(head == null || head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;

        while(fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                flag = true;
                break;
            }
        }

        if(!flag) {
            return null;
        }

        fast = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}