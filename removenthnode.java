// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        int count=0;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(count<=n){
            fast=fast.next;
            count++;
        }
        while(fast != null){
            fast=fast.next;
            slow=slow.next;
        }
        ListNode temp= slow.next;
        slow.next=temp.next;
        temp.next=null;
        
        return dummy.next;
    }
}