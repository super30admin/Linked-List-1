// Time Complexity :O(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach: First run the fast loop till n and again run the fast and slow pointer with same speed to get element before the target.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow= head;
        ListNode fast=head;

        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
    return head;
    }
}