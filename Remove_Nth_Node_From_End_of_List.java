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
// TC : O(n)
// SC : O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head == null || head.next == null) return null;
        
        ListNode d = new ListNode(-1);
        d.next = head;
        ListNode fast = d;
        ListNode slow = d;
        int size = 0;
        
        while(size <= n) {
            size++;
            fast = fast.next;
        }
        
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return d.next;
    }
}
