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
//T.C = O(n)
//S.C = O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(1,null);
        
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;
        
        int count = 0;
        
        while(count<=n)
        {
            fast = fast.next;
            count++;
        }
        
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next = slow.next.next;
        
        return dummy.next;
        
    }
}