// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


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
        //set a slow and fast pointer to the head
        ListNode slow = head;
        ListNode fast = head;
        //have a dectection to see if there is a cycle or not
        boolean detect = false;
        //now start a while loop that goes until fast and fast's next doesn't equal null -- allows us to go through the linked  list
        while(fast != null &&  fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            //if both slow and fast equal each other in this loop that means there is a cycle
            if(slow == fast){
                //set our dectection to true to indicate that we have a cycle
                detect = true;
                //break out of this if
                break;
            }
        }
        //if detection wasn't triggered return null
        if(!detect) return null;
        //set slow to head
        slow = head;
        //if there is a cycle then start a while loop that moves slow back to head while moving it 1x and moves fast at 1x until they equal. That is the node where the cycle starts
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        //return either pointer that is the point at which cycle occurs
        return slow;
    }
}