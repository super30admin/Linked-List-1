// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
   public ListNode reverseList(ListNode head) {
       
       
       //iterative approach 
       
 /*      ListNode prev = null;        
       while (head != null) {
           ListNode nextTemp = head.next;
           head.next = prev;
           prev = head;
           head = nextTemp;
       }
    return prev;
    
    */
       
       //recursive approach        
       
       if(head==null || head.next==null)
           return head;
       
       
       ListNode reverse=reverseList(head.next);
       head.next.next=head;
       head.next=null;
       
       return reverse;
       
       
   }
}class reverseLL {
    
}
