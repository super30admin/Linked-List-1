//TC: O(n)
//SC: O(1)
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
        int count=0;
        ListNode slow;
        ListNode fast;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        slow=dummy;
        fast=dummy;
        head=dummy;
        while(count<=n)
        {
          fast=fast.next;
          count++;
        }
        
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head.next;
        
    }
}