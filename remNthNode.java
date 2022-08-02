
//---------------------BRUTE FORCE---------------------------------------------------------------
// Time Complexity :O(n) where n is no of nodes
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int start = 0;
        int len = 0;
        int count = 1;
        ListNode ptr1 = head;
        if (head.next == null)
            return null;
        while (ptr1 != null) {
            len++;
            ptr1 = ptr1.next;
        }
        ListNode curr = head;
        ListNode prev = curr;
        start = len - n + 1;
        while (count != start) {
            prev = curr;
            curr = curr.next;
            count++;
        }
        if (curr == head) {
            head = head.next;
        } else {
            prev.next = curr.next;
            curr.next = null;
        }

        return head;

    }
}
// ----------------------OPTIMIZED SINGLE PASS
// SOLN------------------------------------------------
// Time Complexity :O(n) where n is no of nodes
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = n;
        ListNode start = head;
        ListNode end = head;

        while (count != 1) {
            end = end.next;
            count--;
        }
        ListNode prev = head;
        while (end.next != null) {
            prev = start;
            start = start.next;
            end = end.next;
        }
        if (start == head) {
            return head.next;
        } else {
            prev.next = start.next;
            start.next = null;
        }
        return head;
    }
}

// ---------------ONE PAss------------------------------
// Time Complexity :O(n) where n is no of nodes
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode dummy = new ListNode(-1, head);
        int count = n;
        while (count > 0) {
            fast = fast.next;
            count--;
        }
        ListNode slow = dummy;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}