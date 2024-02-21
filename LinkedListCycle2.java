// Time Complexity : O(n), O(n) to find the cycle and O(n) to find the beginning
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english : first find if the cycle is present by using 2 pointers and moving one of them at
//2x speed, if they meet, there is a cycle.Use Floyd's cycle finding algorithm or Hare-Tortoise algorithm to find the beginning of the cycle.


// Your code here along with comments explaining your approach

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
        if(head == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        // detect cycle
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                isCycle = true;
                break;
            }
        }
        // if cycle is present, find the beginning of it
        if(isCycle){
            fast = head; // move to the head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        else{ // no cycle
            return null;
        }

        // return isCycle ? slow : null;
        
    }
}