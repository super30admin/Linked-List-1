// Time Complexity: O(n)
// Space Complexity: O(1)

// we first use a slow and fast pointer approach to determine if there is a cycle, then apply Floyd's Tortoise Hare algorithm

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        // determine if there exists a cycle
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;  

            if (slow == fast)
                break;  
        }

        if (fast == null || fast.next == null) return null; // no cycle found

        // reset slow to head
        slow = head;

        // walk slow and head one at a time until they meet. The meeting point is the entrance of the cycle
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // entrance to the cycle
        return slow;
    }
}
