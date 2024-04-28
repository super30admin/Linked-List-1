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
// Time Complexity : O(N), N is the length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        //To maintain N distance between slow and fast pointer
        while(count <= n) {
            fast = fast.next;
            count++;
        }
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //deleting Nth node from the end of the list
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;
        return dummy.next;

    }
}