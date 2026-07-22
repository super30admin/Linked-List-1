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
public class Solution {
    /*
        TC - O(n)
        SC - O(1)

        We first initialize two pointers: slow moves one step at a time and fast moves two steps at a time.
        Then we traverse the list:
        If fast reaches null, there is no cycle, so return null. If slow and fast meet, a cycle exists.
        Reset slow to the head while keeping fast at the meeting point.
        Move both pointers one step at a time.
        The node where they meet again is the starting node of the cycle, which is returned.
    */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                flag = true;
                break;
            }
        }

        if (!flag) return null;

        slow = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}