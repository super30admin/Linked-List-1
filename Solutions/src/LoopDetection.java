// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :No
// Any problem you faced while coding this : 5/13 cases passed
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
public class LoopDetection {
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
        while( (fast.next!=null && fast.next.next!=null) || slow.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                break;
            }

        }
        if(fast ==null || fast.next==null){
            return null;
        }
        slow = head;
        while(slow!=fast){
            slow = slow.next;
            fast =fast.next;
        }
        return fast;
    }
}
