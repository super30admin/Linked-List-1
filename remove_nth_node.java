// Time Complexity : O(2n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Some Test cases I did not think of.


// Your code here along with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)
            return null;
        
        ListNode traverse=head;
        int count=0;

        /* First loop , find the n value*/
        while(traverse!=null)
        {
            count++;
            traverse=traverse.next;
        }
        
        if(count<n)
            return null;
        
        int k=count-n;
        traverse=head;
        if(k==0)
            head=head.next;
        
            /* Second loop, go upto kth element */
        while(k-->1)
            traverse=traverse.next;
        
        /* Delete Element */
        if(traverse.next!=null)
            traverse.next=traverse.next.next;
        else
            traverse.next=null;
        
        return head;
    }
}