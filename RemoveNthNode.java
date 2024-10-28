class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        int count=0;
        
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        while(count<=n){
            fast=fast.next;
            count++;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
            
        }
        ListNode temp=slow.next;
        slow.next=slow.next.next;
        temp.next=null;
        
        return dummy.next;
    }
}