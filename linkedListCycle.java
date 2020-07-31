
// O(2n)
// O(1)

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return null;
        
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=false;
        
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            
            if(fast==slow)
            {
                flag=true;
                break;
            }
        }
        if(flag==false) return null;
        
        slow=head;
        
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        return fast;
        
    }
}
