// Time complexity: o(n)
// Approach
//  have two nodes, one fast node that jumps two nodes at a time, and one slow node that points to next node at a time
// At any point, those two nodes would meet if it is a cyclic linked list

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class problem3 {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                slow = head;
                while(slow!=fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}