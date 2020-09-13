// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        ListNode intersect = intesectList(slow , fast );
        if(intersect == null){
            return null;
        }
        
        while(intersect != slow){
            slow=slow.next;
            intersect=intersect.next;
        }
        return slow;
        
    }
    private ListNode intesectList(  ListNode slow,  ListNode fast){
        
        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
}
