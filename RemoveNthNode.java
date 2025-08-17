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
 // This uses two pointer approach - slow and fast. First we move the fast pointer to n+1 position from left. And then we move both slow and fast together so that slow ends up at n+1 position from end. And we delete the nth element from there.
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode dummy = new ListNode();
        dummy.next=head;

        ListNode slow = dummy;
        ListNode fast = dummy;
        while(count<=n) {
            fast=fast.next;
            count++;
        }

        while(fast!=null) {
            slow=slow.next;
            fast=fast.next;
        }

        ListNode temp = slow.next;
        slow.next=slow.next.next;
        temp.next=null;
        return dummy.next;
    }
}
