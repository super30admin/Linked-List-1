// Time Complexity :O(n) n-number of nodes
// Space Complexity :O(n)
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