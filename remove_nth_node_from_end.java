

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
        if(head == null){
            return head;
        }

        if(head.next == null){
            return null;
        }

        ListNode first = head;
        ListNode second = head;

        int count = 0;

        while(count<n && first.next!=null){
            first = first.next;
            count = count + 1;
        }
        if(count<n){
            first = null;
            second = second.next;
            return second;
        }
        while(first.next!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return head;
    }
}
