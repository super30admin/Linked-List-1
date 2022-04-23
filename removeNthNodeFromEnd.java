/**
Problem: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
TC: O(m) where m = length of list
SC: O(1)
*/
class Solution {
    // Approach 1: 2 traversals
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode cur = head;
        
        while (cur != null) {
            ++len;
            cur = cur.next;
        }
        
        int nFromBeginning = (len - n + 1);
        
        if (nFromBeginning <= 1)
            return head.next;
        
        cur = head;
        int i = 1;
        
        while (i < nFromBeginning - 1) {
            ++i;
            cur = cur.next;
        }
        
        cur.next = cur.next.next;
        return head;
    }

    // Approach 2: single traversal
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode left = dummy, right = dummy;
        int count = 0;
        
        while (count <= n) {
            ++count;
            right = right.next;
        }
        
        while (right != null) {
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy.next;
        
    }
}