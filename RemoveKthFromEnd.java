class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = head;
        ListNode p2 = head;
       
        while(n>0 && p2.next!=null){
            p2 = p2.next;
            n--;
        }
        if(n!=0) return head.next;
        while(p2.next!=null){
            p2=p2.next;
            p1=p1.next;
        }
        
        p1.next=p1.next.next;
        return head;
        
    }
}