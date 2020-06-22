/**
 * time: O(n) n-nodes in the list
 * space: O(1)
 */

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
        ListNode dummy = new ListNode(-9999);
        dummy.next = head;

        ListNode low = dummy, high = dummy;
        int idx = n;
        while(idx >= 0){
            high = high.next;
            idx--;
        }

        while(high!=null){
            low = low.next;
            high = high.next;
        }
        low.next = low.next.next;
        // if(low.next == null) return null;
        return dummy.next;
    }
}