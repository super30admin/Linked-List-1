// Time Complexity : O(n), where n is the number of nodes in the linked list
// Space Complexity : O(1), since we are using only two pointers and no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// We use two pointers — slow moves 1 step, fast moves 2 steps.
// If there is a cycle, slow and fast will eventually meet inside the cycle.
// Once they meet, we reset one pointer to the head and keep both moving 1 step at a time.
// The node where they next meet is the start of the cycle.
// If the list has no cycle, fast or fast.next will become null, and we return null.


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
        Boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;

        //Loop till fast pointer is null or we found a loop
        while(fast != null && fast.next != null){
            //Move slow pointer 1x
            slow = slow.next;
            //Move fast pointer 2x
            fast = fast.next.next;

            //If slow and fast pointer meet: loop exists break
            if(slow == fast){
                flag = true;
                break;
            }

        }
        //If flag is false no loop -> return null
        if(!flag) return null;

        //Else move one of the ptr to head and find the loop head
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}