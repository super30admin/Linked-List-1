// Time Complexity : O(n) as we traverse the list only once
// Space Complexity : O(1) as we use only pointers to the LL nodes in the code
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Getting the edge case correct when the LL is of size 1 or 2 was
// a little tricky. 


// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || (head.next == null && n == 1)) return null;
        ListNode slow = head, fast = head, prev = null;
        while (n > 1) {
            fast = fast.next;
            n--;
        }
        while (fast.next != null) {
            prev = slow;
            fast = fast.next;
            slow = slow.next;
        }
        if (prev != null)
            prev.next = slow.next;
        else
            head = head.next;
        return head;
    }
}