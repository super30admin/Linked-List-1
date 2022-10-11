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
    
    // method - 1
    // TC :O(n)
    // SC :O(1)
    public ListNode reverseList(ListNode head) {
        
        ListNode cur, next, prev;
        
        if(head == null) return head;
        
        cur = head;
        next = cur.next;
        prev = null;
        
        while(cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    
    // method -2 Recursion
    // TC : O(n)
    // SC : O(n)
    // using global pointer
    public ListNode headPtr;
        public ListNode reverseList(ListNode head) {
            if(head == null) return head;
            ListNode cur = head;
            helper(cur, null);
            return headPtr;
        }
    private void helper(ListNode cur, ListNode prev) {
        
        if(cur == null) {
            headPtr = prev;
            return;
        }
        helper(cur.next, cur);
        cur.next = prev;
    }
}
