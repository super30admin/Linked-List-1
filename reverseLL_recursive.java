class Solution {
     ListNode prev=null;
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
      
        ListNode curr=head;
        
        helper(prev,head);
        
        return prev;
    }
    
    private void helper(ListNode prev, ListNode curr)
    {
        if(curr==null || prev==null)
            return;
        
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        
        helper(prev,temp);
    }
}
