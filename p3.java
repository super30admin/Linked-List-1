// Time Complexity : O(n)
// Space Complexity : O(1)
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
        //Using two pointers to detect cycle
        ListNode slow = head;
        ListNode fast = head;
//Edge case if there is no cycle
        if(fast == null || fast.next == null){
            return null;
        }
//We have to find where these two pointers meet to detect the head of cycle
        slow = slow.next;
        fast = fast.next.next;
//Run the loop till two pointers meet or if there is no cycle then fast would end up at null
        while(fast!= null && fast.next!=null && slow!= fast){
            slow = slow.next;
            fast = fast.next.next;
        }
//If fast ends up at null, return null
        if(fast == null || fast.next == null){
            return null;
        }
//If there is a cycle, the head of cycle would be equidistant from head of linked list and where the two pointers met
        slow = head;
//Finding the point which is equidistant
        while(slow!= fast){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
}