// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * We use theory that if there is a cycle, then by using two pointers we can track origin of cycle.
 * Where one pointers moves only by 1 and other by 2 (twice). 
 * So once we get their meeting point, then distance between meeting point to start of cycle is equal to
 * distance between start of LL to start of cycle. So we can travel from meeting point and start of LL 
 * One by one and then we will meet at exactly the point where cycle begins.
 * For this we use two pointers, slow and fast. Fast travel twice the distance than slow which is 1.
 * Now we keep on pushing forward slow and fast till they meet each other. 
 * If they dont meet i.e. then we return null as there is no cycle
 * Else if they meet, we reset slow and keep on incremeting slow and fast till they meet again
 * This time when they meet we can be assured that this is the starting point of cycle. 
*/


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
        if(head == null || head.next == null)return null;
        
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        
        
        while(fast != null && fast.next != null && slow != fast){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast == null || fast.next == null)return null;
        slow = head;
        
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        return fast;
    }
}