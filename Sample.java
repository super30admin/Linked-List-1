/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        int len = 0;
        
        ListNode slow= head;
        ListNode fast= head;
        
        while(n>0 && fast!=null){
            fast=fast.next;
            n--;
        }
      
      //when only node in the list
        if(fast==null)
            return head.next;
        
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        
               
        return head;
        
    }
}
