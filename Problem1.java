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
class Problem1 {
    public ListNode reverseList(ListNode head) {
        // null check
        if(head == null) return null;

        ListNode prev = null;
        ListNode curr = head;
        ListNode ahead = head.next;

        while(ahead != null){
            curr.next = prev;
            prev = curr;
            curr = ahead;
            ahead = ahead.next;
        }
        // curr.next would now be null
        // need to link it with previous node
        curr.next = prev;
        head = curr;
        return head;
    }
}
// TC: O(n)
// SC: O(1)