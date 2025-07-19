// Time Complexity: O(n)
// Space Complexity: O(1)

// We use 2 pointers, first we move n + 1 spaces. Then start the second pointer at head. Now both pointers are n spaces apart, move both pointers one by one. We have nth node from last. 

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
        if (head.next == null) {
            return head.next;
        }

        int ctr = 0;
        ListNode curr = head;
        while (ctr < n) {
            curr = curr.next;
            ctr++;
        }

        ListNode start = null;
        while (curr!=null) {
            curr = curr.next;
            if (start == null) start = head;
            else start = start.next;
        }

        if (start == null) head = head.next; // indicates we need to delete the head element
        else start.next = start.next.next; // delete the nth node from the end

        return head;
    }
}
