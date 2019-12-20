Time Complexity-O(n)
Space Complexity-O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next,curr=head,prev=null;;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
       }
        
        return prev;
    }
}
