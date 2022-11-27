// Time Complexity : O(n)
// Space Complexity :O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
       
        ListNode prev=null;
        ListNode curr=head;
        ListNode future=head.next;
        
        while(future!=null){
            curr.next=prev;
            prev=curr;
            curr=future;
            future=future.next;
        }
        
        curr.next=prev;
        return curr;
    }
    
    
}