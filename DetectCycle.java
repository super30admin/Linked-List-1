// Time Complexity: O(n)
// Space Complexity: O(1) for the slow and fast pointers
// Leetcode Problem: https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Detects the node where the cycle begins in a linked list using Floyd’s Tortoise and Hare algorithm.
 * Uses two pointers to detect the cycle and then find the cycle's entry point.
 * Returns the starting node of the cycle if present, otherwise returns null.
 */

public class DetectCycle {
    

 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
    public ListNode detectCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                slowPtr = head;
                while (fastPtr != slowPtr) {
                    slowPtr = slowPtr.next;
                    fastPtr = fastPtr.next;
                }
                return slowPtr;
            }
        }
        return null;
    }
}
