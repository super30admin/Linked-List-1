//Time Complexity : O(n)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public ListNode reverseList(ListNode head) {
        //base case
        if(head==null || head.next==null)
            return head;
        //initialize 3 pointers, previous, current and fast
        ListNode p=null, c=head, f=head.next;
        //iterate over the nodes and move the pointers until the list is reversed
        while(f!=null){
            c.next=p;
            p=c;
            c=f;
            f=f.next;
        }
        c.next=p;
        //return current list
        return c;
    }
}