// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// approach mentioned inline with code

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
        // edge case
        if(head == null || head.next == null) return null;
        
        // considering fast and slow pointers to detect cycle in linked list
        // if a cycle exists then at some node fast and slow pointers will meet
        ListNode fast = head, slow = head;
        boolean flag = false; // flag sets to true if cycle is found
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        
        // In order to identify the cycle starting point, slow can be reset to head
        // Now, whenever slow and fast will meet, that point will be the starting point of the cycle
        slow  = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}

