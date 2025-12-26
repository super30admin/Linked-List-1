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
        ListNode dummy = new ListNode(-1);
        ListNode slow = dummy;
        ListNode fast = dummy;
        dummy.next = head;
        int count = 0;
        //after this loop fast will point at node before the node to be removed
        while(count<=n){
            System.out.println(count);
            count++;
            fast = fast.next;
        }

        //then slide window
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode curr = slow.next; //curr is node to be removed
        slow.next = slow.next.next;
        curr.next = null;


        return dummy.next;
    }
}