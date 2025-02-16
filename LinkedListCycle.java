// Time Complexity : O(n) where n is the number of nodes in the linked list
// Space Complexity : O(1) as we are using constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
// Approach: We will use two pointers, slow and fast. We will move slow pointer by one step and fast pointer by two steps. If there is a cycle, then both pointers will meet at some point. If there is no cycle, then fast pointer will reach the end of the list. If there is a cycle, then we will set slow pointer to head and move both pointers by one step. The point where they meet is the start of the cycle. If there is no cycle, then we will return null.

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
public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        // find if fast and slow pointer matches
        ListNode fast = head;
        ListNode slow = head;
        boolean flag = false;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                flag = true;
                break;
            }
        }

        if(!flag){
            return null;
        }
        // set the slow at head and move both at same pace
        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}