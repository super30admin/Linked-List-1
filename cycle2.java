// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode slow=head;
        ListNode fast=head;
        boolean hasCycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                hasCycle=true;
                break;
            }
        }
        if(!hasCycle){
            return null;
        }
        slow=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
}