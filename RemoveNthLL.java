// Time Complexity : O(n)
// Space Complexity : O(1) , no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//to do it in single pass, we shall take 2 pointers and maintain the distance between the 2 as the given n
//so that when the first pointer reaches the last node, beacuse of the gap, the second will be at the node whose next node needs to be changed to next.next
//return dummy.next at last

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode p1=dummy;
        ListNode p2=dummy;
        while(n>0){
            p2=p2.next;
            n-=1;
        }
        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p1.next=p1.next.next;
        return dummy.next;
    }
}