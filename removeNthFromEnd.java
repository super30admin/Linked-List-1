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
// Time Complexity: O(n)
// Space Complexity: O(1)
// Runs on Leetcode:  yes
class Solution {

   public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode HEAD=head, temp=head;
       while(n>0 && temp.next!=null){
           temp=temp.next;
           n--;
       }
       if(n==1) return HEAD.next;
       if(n>1) return null;
       while(temp.next!=null){
           temp=temp.next;
           head=head.next;
       }
       head.next=(head.next).next;
       return HEAD;
   }
}