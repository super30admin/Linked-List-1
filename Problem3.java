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

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//The algorithm used is the Floyd's cycle detection. Fast pointer moves two steps ahead
// and slow pointer moves one step ahead. if slow and faster pointer meets, a cycle is detected
// to find the meeting point. Bring slow pointer to the starting. Iterate slow and faster pointer
// and find their meeeting point.
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean doesItMeet = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                doesItMeet = true;
                break;
            }
        }
        slow = head;
        while(doesItMeet){
            if(slow == fast){
                return slow;
            }
            slow = slow.next;
            fast = fast.next;

        }

        return null;


    }
}