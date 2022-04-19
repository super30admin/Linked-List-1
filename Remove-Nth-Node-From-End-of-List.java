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
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        dummy.next = head;
        ListNode fast = head;
        int count = 0;
        while(count != n){
            fast = fast.next;
            count++;
        }
        while(fast!=null){
            fast = fast.next;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        return dummy.next;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)