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
        // Check if the head of the linked list is null
        if(head == null)
            return null;

        // Initialize two pointers, slow and fast, to the head of the list
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;

        // Iterate through the list with the slow pointer moving one step at a time,
        // and the fast pointer moving two steps at a time
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // If the slow and fast pointers meet, there is a cycle in the linked list
            if(slow == fast){
                hasCycle = true;
                break;
            }
        }

        // If there is no cycle, return null
        if(!hasCycle)
            return null;

        // Move the fast pointer back to the head of the linked list
        fast = head;

        // Move both pointers one step at a time until they meet again,
        // this is the start of the cycle
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        // Return the node where the cycle begins
        return fast;
    }
}

// Time Complexity: O(n) - where n is the total number of nodes in the linked list
// Space Complexity: O(1) - constant space used, independent of the input size
