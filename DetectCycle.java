// Time Complexity : The time complexity is O(n) where n is the number of noded.
// Space Complexity : The space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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

        ListNode slow = head;
        ListNode fast = head;

        // If null is found, return null
        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meets, it means there is a cycle
            if(slow == fast){
                slow = head;
                // Iterate to find the starting point of the cycle
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;

    }
}