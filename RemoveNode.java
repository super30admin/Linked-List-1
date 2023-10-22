// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
       ListNode dummy=new ListNode(-1);
       ListNode slow=dummy;
       dummy.next=head;
       ListNode fast=dummy;
       ListNode temp;
       int count=0;
       while(count<=n){
           fast=fast.next;
           count++;
       }
       while(fast!=null){
           slow=slow.next;
           fast=fast.next;
       }
      temp=slow.next;
      slow.next=temp.next;
      temp=null;
       
       return dummy.next;
    }
}