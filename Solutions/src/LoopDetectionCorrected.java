// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : no
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
public class LoopDetectionCorrected {
    public ListNode detectCycle(ListNode head) {
        if (head == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        if(slow.next==null){
            return null;
        }
        // if (slow == fast.next.next){
        //     return slow;
        // }
        while(fast!=null && fast.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }

        }

        return null;
    }
}
