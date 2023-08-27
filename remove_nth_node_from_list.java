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
       int counter = 0;
       ListNode dummy = new ListNode(-1);
       dummy.next=head;
       ListNode fast=dummy;
       ListNode slow=dummy;
       int count=0;
       int k=counter-n;


       while(count<=n)
       {
           fast=fast.next;
           count++;
       }
       System.out.println(counter);


       while(fast!=null)
       {
           fast=fast.next;
           slow=slow.next;

       }
       ListNode temp=slow.next;
       System.out.println(slow.next);
       slow.next=slow.next.next;
       temp.next=null;
       return dummy.next;
    }
}