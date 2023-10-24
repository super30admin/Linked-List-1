// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class LinkedListCycleII {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode slow = head, fast = head;
            boolean flag = false;

            if(head == null || head.next == null)
                return null;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;

                if(slow == fast){
                    flag = true;
                    break;
                }
            }

            //no cycle
            if(flag == false)
                return null;

            //distance from head to cycle head == distance from slow/fast to cycle head(a=c)
            slow = head;
            while(slow != fast){
                fast = fast.next;
                slow = slow.next;
            }

            return fast;
        }
    }
}
