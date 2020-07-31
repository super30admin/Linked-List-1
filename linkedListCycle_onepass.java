// O(n) one pass solution
// O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null || head.next==null && n==1)
            return null;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        
        /* Go to nth+1 element element */
        ListNode fast=dummy;
        ListNode slow=dummy;
        boolean flag=false;
        
        for(int i=0;i<=n;i++)
            fast=fast.next;
        
        /* Loop till null */
        
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        /* delete element */
        
        slow.next=slow.next.next;
        
        return dummy.next;
    }
}