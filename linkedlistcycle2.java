/*
Time Complexity: O(N)
Space Complexity: O(1)
    */
public class Solution {
public ListNode detectCycle(ListNode head) {

   if(head==null || head.next==null)
      return null;
    
    ListNode slow=head;
    ListNode fast=head;
     ListNode start=head;
    
    while(fast.next!=null && fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            while(fast!=start){                                       
                fast=fast.next;
                start=start.next;
            }
            return start;          
        }      
}
    
    return null;   
}
}