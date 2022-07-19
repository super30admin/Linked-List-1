//Time complexity- O(n)
// Space complexity- O(1)
//Successfully ran on leetcode

class Solution {
 public ListNode removeNthFromEnd(ListNode head, int n) {
     
     if(head== null) return head;
     
     ListNode dummy= new ListNode(-1);
     dummy.next= head;
     
     int count= 0;
     ListNode slow= dummy;
     ListNode fast= dummy;
     
     while(count <= n){
         count++;
         fast= fast.next;
     }
     
     while(fast != null){
         slow= slow.next;
         fast= fast.next;
     }
     
     slow.next= slow.next.next;
     
     return dummy.next;
 }
}