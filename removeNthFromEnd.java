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
  
  //TC:O(n) SC:O(1)
  
  //removing nth  from end is same as removing length-n+1 from first
 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        int idx=len-n+1;
        //if the first element has to be removed, edge case that has to be taken care
        if(idx==1)
            return head.next;
        
        int count=0;
        temp=head;
        //go to last but one element before  target 
        while( count++<idx-2){
            
            temp=temp.next;

        }
        //connect the next of target's previous to target's next
       temp.next=temp.next.next;
        return head;
        
    }
}
