// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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
public class cycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        boolean hasCycle = false;
        while(fast != null && fast.next !=null){ 
            slow = slow.next; // moving slow by 1x
            fast = fast.next.next; // moving fast by 2x
            if(fast == slow){
                hasCycle = true;
                break; // come out of the loop
            }
        }
        if(!hasCycle){
            return null;
        } // there is no cycle
        fast = head;
        while(slow != fast){ // second loop to check start of cycle
            slow = slow.next;
            fast = fast.next;
        }
        return slow; // can also be fast
    }
}