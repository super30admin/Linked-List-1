// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next= head;
        if(head==null) return head;
        int count =1;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(count<=n){
            slow = slow.next;
            count++;
        }
        while(slow!=null && slow.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=fast.next.next;
        return dummy.next;
    }
}