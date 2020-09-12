// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        
        ListNode dummynode = new ListNode(-1);
        dummynode.next=head;
        ListNode p1 = dummynode;
        ListNode p2 = dummynode;
        
        while(n>0){
            p2=p2.next;
            n-=1;
        }
        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        
        p1.next=p1.next.next;
        return dummynode.next;
    }
}