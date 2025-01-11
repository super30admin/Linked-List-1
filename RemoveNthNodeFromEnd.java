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
 
/*
    Leetcode problem 19: Remove Nth Node From End of List
    T.C: O(n) :: S.C: O(1)

    Solved using two pointers: Fast and Slow point to a dummy node and this dummy node
    points to the head.Now we move the fast pointer n times in the linked list, and after
    that we move both pointers simultaneously in linked list until the fast reaches null.
    We will find that the slow pointer is perfectly positioned at the element whose next
    has to be removed (i.e the diff b/w fast and slow is n). Point the slow's next to next.next
    and return the head (-> dummy's next!).

    Dummy Node - It is important to consider adding the dummy node in the beginning to handle the 
    edge cases, where we have only one node (the head) and it has to be removed.
*/

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) return null;

        ListNode dummy = new ListNode(-1, head);
        ListNode fast = dummy;
        ListNode slow = dummy;
    
        int count = 0;

        while (count <= n) {
            fast = fast.next;
            count++;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        if (slow != null && slow.next != null) {
            slow.next = slow.next.next;
        }        

        return dummy.next;
    }
}