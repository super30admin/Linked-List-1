//time- O(N)
//Space- O(1)

//floyd's cycle detection algo
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
    
        
        ListNode fast=getIntersect(head);
        
        if(fast==null) return null;
        
        ListNode slow= head;
        
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        
        return slow;
    }
    
    public ListNode getIntersect(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
        
        while(fast!=null&& fast.next!= null){
            
            fast= fast.next.next;
            slow= slow.next;
            
            if(fast== slow) return slow;
            
        }
        return null;
        
    }
}