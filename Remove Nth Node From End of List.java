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

 //TC = O(n)
 //SC = O(1)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int count = 0;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while(count<=n)
        {
            fast = fast.next;
            count++;
        }
        while(fast!= null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;
        return dummy.next;
        
    }
}