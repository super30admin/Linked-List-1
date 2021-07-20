//time- O(N)
//space- O(1)

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //dummy node
        ListNode res= new ListNode(-1);
        res.next=head;
        ListNode first=res;
        ListNode second=res;
        
        
    //move n node fwd
        
        for(int i=0; i<=n; i++){
            
           first=first.next;
        }
        
        while(first!=null){
            second=second.next;
            first=first.next;
        }
        
        
        second.next=second.next.next;
        
        return res.next;
        
    }
}