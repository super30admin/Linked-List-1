/**
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * LeetCode: Y (https://leetcode.com/problems/linked-list-cycle-ii)
 * Approach: This solution consists of two parts: 
    (i) detecting if a cycle exists
    (ii) if a cycle exists then find the node where the cycle begins
    
    Detecting if a cycle exists using Floyd's tortoise and hare algorithm
    Start moving tortoise from head one node at a time.
    Start moving hare from head two nodes at a time.
    
    If the hare pointer reaches the end of the Linked List then the given Linked List does not contain a cycle.
    If the hare pointer and tortoise pointer meet then a cycle exists.
    This is because the hare pointer moves two nodes at a time and if they meet then then a cycle should be present.
    
    After detecting if a a cycle exists then to determine the node where the cycle begins move one pointer to the head of the Linked List.
    Start moving the two pointers one node at a time and the node where the two pointers meet is the brginning of the cycle.
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Start two pointers from head
        ListNode slow = head, fast = head;
        
        // Assume that a cycle does not exists
        boolean doesCycleExists = false;
        
        while(fast != null && fast.next != null) {
            // Move tortoise pointer one node at a time
            slow = slow.next;
            
            // Move the hare pointer one node at a time
            fast = fast.next.next;
            
            // If the hare and tortoise pointer meet then a cycle exists
            if(slow == fast) {
                doesCycleExists = true;
                break;
            }
        }
            
        // if there was no cycle in the given Linked List then return null
        if(!doesCycleExists) {
            return null;
        }
        
        // Move the tortoise pointer to the beginning of the Linked List
        slow = head;
        
        // Continue moving the two pointers one node at a time until they meet
        while(slow != fast) {
            // Move the tortoise pointer one node at a time
            slow = slow.next;
            // Move the hare pointer one node at a time
            fast = fast.next;
        }

        // Return the tortoise or hare pointer
        return slow;
    }
}
