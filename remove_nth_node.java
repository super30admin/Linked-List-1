// Time Complexity :O(n) n-number of nodes
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        ListNode slow=dummy;
        ListNode fast=dummy;
        dummy.next=head;
        int i=0;
        while(i<=n)
        {
            fast=fast.next;
            i++;
        }
        
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        slow.next=slow.next.next;
        
        return dummy.next;
        
    }
}


/*
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
*/