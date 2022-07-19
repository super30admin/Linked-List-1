//Time complexity- O(n)
// Space complexity- O(1)
//Successfully ran on leetcode

class Solution {
 public ListNode reverseList(ListNode head) {
     
     if(head== null || head.next== null) return head;
     
     ListNode prev= null; 
     ListNode curr= head;
     ListNode fast= head.next;
     
     while(fast!= null){
         
         curr.next = prev;
         prev= curr; 
         curr= fast;
         fast= fast.next;
     }
     curr.next= prev;
     
     return curr;
 }
}