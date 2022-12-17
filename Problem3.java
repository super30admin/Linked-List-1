// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes logic for checking the start of the cycle was difficult

 /*
 To check if the cycle exists or not, we will move fast twice and slow once, if they meet , cycle exists
 when then keep slow at the same place and start fast from head and move both one step, where they meet is the begining of cycle
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        // handle single ListNode
        if(head.next==null) return null;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
            break;
        }

        if(fast == slow){ // cycle exists

        // move fast back to the head

        fast = head;

        while(fast!=slow){
            fast = fast.next;
            slow=slow.next;
        }
        return fast;
        }
        
        return null;
    }
}