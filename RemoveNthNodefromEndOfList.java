/*
 * Definition for singly-linked list.
 */ 
 
  /*Approach
  1) we declare a dummy node and pointing to -1. dummy.next points to head node and use slow and fast pointers
  2) thus we can end up at previous node of the node of which has to be deleted, if we start from the start node(head), we might end up at the element which has to be deleted or even further.
  3) Thus we take a count variable and increase till n, and increase the fast pointer till the point. 
  4) thus after that part we come to know where does the n node lies and increase the slow as well till the next node of fast is not null.
  5) and we need to delete the next node of the slow pointer.

  
  */
class Solution {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)
            return null;
        
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        int count=0;
        
        while(count<n)
        {
            fast=fast.next;
            count++;
        }
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
        
        
    }
}