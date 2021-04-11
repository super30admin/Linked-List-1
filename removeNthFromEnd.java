/*
Run time complexity - O(N) where N is the number of elements in the linked list
Space complexity - O(1) no additional space is used for this iteration.

*/
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
        if(head==null || (head.next==null && n==1))
            return null;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        int temp=0;
        while(temp<n && fast !=null)
        {
            fast=fast.next;
            temp++;
                
        }
        if(fast==null && temp==n)
        {
            head=head.next;
            return head;
        }
        if(fast==null)
        {
            return head;
        }
        
        while(fast!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=slow.next;
        return head;
            
    }
}
