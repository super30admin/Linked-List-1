// Did this code successfully run on Leetcode : Yes
// Time Complexity :
// Space Complexity :O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast = head;
        boolean isCycle = false;
        if(head==null) return null;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCycle = true;
                break;
            } 
        }
        if(isCycle){
            ListNode slow2 =head;
            while(slow!=slow2){
                slow2=slow2.next;
                slow=slow.next;
            }
            return slow;
        }
       return null; 
        
    }
}
