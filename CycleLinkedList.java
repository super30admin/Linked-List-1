// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Using slow and fast pointer algorithm,, we can find if there is cycle or not
//head to the cycle start point length is equal to the length from cycle start to point where we found the cycle
//return the node if there is


public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        ListNode dummyHead=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast){
                while(dummyHead!=slow){
                dummyHead=dummyHead.next;
                slow=slow.next;
                }
                    return slow;
                }
            }
      
        return null;
    }
}