// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode fast = head;

        //increment fast until we reach n-1 th item
        for(int i=0;i<n;i++) {
            fast=fast.next;
        }
        
        //in case fast == null; then we want to delete the nth node
        if(fast==null) return head.next;
        
        ListNode slow = head;

        //now increment slow until fast.next becomes null
        //this ensures that fast is at the nth pos and slow is at n-1th node from end 
        while(fast.next != null) {
            fast=fast.next;
            slow=slow.next;
        }
        
        //once slow has reached n-1 th pos, we delete the next node at slow
        slow.next=slow.next.next;
        return head;
    }
}