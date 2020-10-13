// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


class Solution {
    /** We first set a dummy node at head and move our fast pointer by n+1 steps
     * while slow stays at dummy, thus there is a difference of n steps between fast and slow
     * Then we move both fast and slow simultaneously till fast has reached
     * null thus slow has reached n-1th node from the end .
     * Next we simply make slow point to its next's next node. **/
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || (head.next==null && n==1)){
            return null;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }


        slow.next=slow.next.next;
        return dummy.next;

    }
}