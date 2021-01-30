//TimeComplexity O(n)
//Space Complexity O(1)

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        
        if(head==null || n==0)
            return head;
        
        int i=0;
        while(i<=n){
            i++;
            fast=fast.next;
        }
         
        
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        
        return dummy.next;
        
    }
    
}
