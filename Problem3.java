// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//142. Linked List Cycle II
//https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Problem3 {
    boolean flag = false;

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;

        if (head == null || head.next == null)
            return temp;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
            // System.out.println(slow.val);
            // System.out.println(fast.val);
            if (slow == fast) {
                temp = fast;
                flag = true;
                break;
            }
        }

        if (flag) {
            slow = head;
            fast = temp;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;

                if (slow == fast) {
                    temp = slow;
                }
            }
        }

        return temp;
    }
}
