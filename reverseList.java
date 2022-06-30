//T(N) = O(N)
//S(N) = O(1)

class Solution {
        
    
        
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while(head!=null)
        {
            ListNode temp=head.next;
            head.next=newHead;
            newHead=head;
            head=temp;
            
        }
        return newHead;
            
        
    }
}