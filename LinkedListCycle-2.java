// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes 		
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


public class Solution {
    public ListNode detectCycle(ListNode head) {
     
        
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
          
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(flag == false)
            return null;
         slow = head;
        while(fast!=null || slow!=null){
            if(fast == slow)
               break;
            fast= fast.next;
            slow = slow.next;
            
        }
        
        return slow;
    }
}