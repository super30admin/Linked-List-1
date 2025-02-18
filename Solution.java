//Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

//Brute force solution

// Time Complexity :    O(n) as we go through the linked list once
// Space Complexity :   O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.HashMap;

public class Solution {
    public ListNode detectCycle(ListNode head) {
        // Use temp to traverse the linked list
        ListNode temp = head;


        HashMap<ListNode, Integer> map = new HashMap<>();

        // Traverse the list using temp
        while (temp != null) {
            // Check if temp has been encountered again
            if (map.containsKey(temp)) {
            // A loop is detected hence return temp
                return temp;
            }
            // Store temp as visited
            map.put(temp, 1);
            // Move to the next node
            temp = temp.next;
        }
        // If no loop is detected, return null
        return null;
    }
}

//Optimal Solution

// Time Complexity :    O(n) 
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class Solution2 {
    public ListNode detectCycle(ListNode head) {
        // Initialize a slow and fast 
        // pointers to the head of the list
        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: Detect the loop
        while (fast != null && fast.next != null) {
            
            // Move slow one step
            slow = slow.next;
            
            // Move fast two steps
            fast = fast.next.next;

            // If slow and fast meet,
            // a loop is detected
            if (slow == fast) {
                
                // Reset the slow pointer
                // to the head of the list
                slow = head;

                // Phase 2: Find the first node of the loop
                while (slow != fast) {
                    
                    // Move slow and fast one step
                    // at a time
                    slow = slow.next;
                    fast = fast.next;

                    // When slow and fast meet again,
                    // it's the first node of the loop
                }
                
                // Return the first node of the loop
                return slow;
            }
        }
        
        // If no loop is found, return null
        return null;
    }
}