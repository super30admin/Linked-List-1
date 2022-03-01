// Time Complexity : O(n) where n is # nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Definition for singly-linked list.

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {

        // Iterative
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
        
//         // Recursive
//         if (head == null || head.next == null) {
//             return head;
//         }
        
//         ListNode newHead = reverseList(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newHead;
    }
}