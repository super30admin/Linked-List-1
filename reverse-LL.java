

//Time Complexity :O(n)
//Space Complexity :O(1)
//Did this code successfully run on Leetcode :Yes
//Any problem you faced while coding this :No
//Solved using three pointer prev=null;curr=head and fast=head.next
//on each iteration curr.next=prev and then update prev =curr ;curr=fast and fast=fast.next
//at the last iteration fast==null gets out of loop so link at link curr.next=prev
//and we return curr
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode fast=head.next;
        while(fast!=null){
            curr.next=prev;
            prev=curr;
            curr=fast;
            fast=fast.next;
        }
        curr.next=prev;
        return curr;

    }
}