// 19 Remove Nth node from end of list
// Solved on Leetcode
// time Complexity - O(n)
// Space complexity - O(1)

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
        
        
      
        
        ListNode temp = new ListNode();
        temp.next=head;
        head=temp;
        
        ListNode slow=head;
        ListNode fast=head;
        int count=0;
       
        while(count<n){
            fast=fast.next;
            count++;
        }
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        
        slow.next=slow.next.next;
        return temp.next;
    }
}