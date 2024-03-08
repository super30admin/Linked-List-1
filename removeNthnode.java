//time O(N)
//space O(1)
//approach Two pointers

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
        if(head.next == null && n == 1) return null;
        if(head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        int count  = 0;
        while(count < n) {
            fast = fast.next;
            count++;
        }
        if(fast == null) {
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
    return head;
    }
}
