// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/**
 * Approach:
 * This problem is about removing the nth node from the end of a linked list.
 * First, I reversed the linked list so that the last node becomes the first node, making it easier to access the nth node from the end.
 * Then, I moved the pointer to the (n-1)th position in the reversed list and removed the current node by adjusting the previous node's next pointer.
 * Finally, I reversed the list again to restore its original order and returned the new head of the list.
 */

//To handle the case of removal of head, we take a dummy node as the first node and do the same steps

/*
 * Using a fast pointer we travel n distance. Slow pointer initially points to head. Then we slide slow and fast till fast becomes null.
 * Slow pointer points to previous node of the node which is to be deleted. Then we delete next node.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        int count = 0;
        while (count <= n) {
            fast = fast.next;
            count++;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // ListNode temp = slow.next;
        slow.next = slow.next.next;

        return dummy.next;
    }
}