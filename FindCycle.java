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
// Time Complexity :  O(N) as there is traversal of all nodes in LL to check for cycles
// Space Complexity : O(1) as no extra space is used and only pointers are used
// Did this code successfully run on Leetcode : Yes

public class FindCycle {

    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;       
        ListNode mid = getCycle(head);  // If there is a cycle, the fast/slow pointers will intersect at some
        // node. Otherwise, no cycle so return null
        if (mid == null)  return null;
        
        ListNode ptr1 = head;  // To find the entrance to the cycle, we have two pointers traverse at
        // the same speed i.e; one from the front of the list, and the other from
        // the point of cycle intersection.
        ListNode ptr2 = mid;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }

 private ListNode getCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {  // A fast pointer moving at 2x speed will either loop around a cycle and meet the slow
        // pointer or reach null if no cycles
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return slow;
            }
        }

        return null;
}
}