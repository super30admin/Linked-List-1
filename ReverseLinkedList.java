/**
 * Definition for singly-linked list.
 */ 
 
  /*Approach
  1) have 3 nodes (previous, head, nextNode)
  2) while loop should run where head!=null we run the loop
  nextNode = head.next;
  head.next = prev;
  prev=head;
  head=nextNode;
  this will have pointers shifting next to next
  */


class Solution {

     class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        
       ListNode prev= null;
       while(head!=null)
       {
           ListNode nextNode = head.next;
           head.next=prev;
           prev =head;
           head =nextNode;
       }
        
       return prev; 
    }
}