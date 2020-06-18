// Time Complexity :O(n) n-number of nodes
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :-
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode rev=head;
        ListNode temp=null;
        
        while(head!=null)
        {
            rev=head;
            head=head.next;
            rev.next=temp;
            temp=rev;
            
        }
        return rev;
    }
}

//Recursion
/*
class Solution {
    public ListNode reverseList(ListNode head) {
     
      
      return helper(head);
    }
    private ListNode helper(ListNode head)
    {
        
        if(head==null || head.next==null) return head; 
        ListNode p=helper(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
}
*/