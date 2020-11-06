package Nov5;

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
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        
/*

 Time complexity = O(n) 
 2 passes through the linked list. 
 Pass 1: In worst case, if cycle begins at the last node of the linked list, detecting cycle would need   traveling till the last node of the list, i.e. O(n).
 Pass 2: To find the start node of the cycle, we will have to make another pass through the linked list after resetting slow pointer to head. This may need to travel till the last node if the cycle is at the last node, i.e. O(n).
 
  
 Space complexity = O(1)
 Because no extra space used.
 
 Did this code successfully run on Leetcode : Yes

 Any problem you faced while coding this : No

Approach:
  Floyd's algorithm used. Slow and fast pointers used to implement Floyd's algorithm
  
*/
        
        // edge
        if (head == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
        
        // detecting if a cycle is present
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        
        // if cycle not present in linked list, return null
        if (!hasCycle) {
            return null;
        }
        
        // if cycle present in linked list:
        // resetting slow pointer back to head
        // As per floyd's algo, no.of steps for slow pointer to go from beginning of linked list TO start node of cycle = no. of steps for fast pointer to go from meeting point of slow and fast pointers in the cycle TO start node of cycle 
        slow = head;
        
        // move slow and fast pointers till they both meet again at start point of cycle
        // and then return either slow/fast because they both point to start node of cycle.
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
       
    }
}