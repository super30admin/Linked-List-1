// Time Complexity :O(n) n-number of nodes
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :concept of dummy node for edge cases is not clear
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode copy=head;
        ListNode result=new ListNode(0);
        result.next=copy;
        int length=0;
        while(copy!=null)
        {
           length++;
           copy=copy.next;
        }
        length-=n;
        copy=result;
        while(length>0)
        {
            copy=copy.next;
            length--;
        }
        copy.next=copy.next.next;
        
    return result.next;
    }
}