//One pass
//https://leetcode.com/submissions/detail/619992095/
//Time:O(n)
//Space: O(1)
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
        ListNode dummy = new ListNode();
        dummy.next = head;
        head = dummy;
        ListNode slow = head;
        ListNode fast = head;
        
        int count = 1;
        
        while(count <= n) {
            fast = fast.next;
            count++;
        }
        
        while(fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}