// Time Complexity : O(n) n is number of nodes 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        ListNode prev = new ListNode(0);
        prev.next=head;
        
        ListNode first = prev;
        ListNode second = prev;
        
        for(int i=1;i<=n+1;i++)
        {
            second = second.next;
        }
        
        while(second!=null)
        {
            first=first.next;
            second=second.next;
        }
        
        first.next = first.next.next;
        
        return prev.next;
    }
}