/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
     ListNode low=head;
     ListNode high=head;
     int flag=0;
     while(high!= null && high.next!=null){
      high=high.next;
      if(high==null){
        return null;
        
      }
      high=high.next;
      if(high==null){
       return null;
      }
      low=low.next;
      
      if(low==high){
       low=head;
       while(low !=high){
        low=low.next;
        high=high.next;
       }
          return low;
      }
       
     }

       return null; 
    }
}