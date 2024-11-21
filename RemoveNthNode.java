/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode low = head;
        ListNode high=head;

        while(n>0){
            high=high.next;
            n--;
        }
        if(high==null) return head.next;
        while(high.next!=null){
           high=high.next;
            low=low.next;
            
        }
         
        if(low.next==null) return head.next;
         low.next=low.next.next;
         
    return head;
    
    }

    
}