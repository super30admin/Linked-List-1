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
// Time complexity 0(n)
// Space complexity 0(n)

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode cur=head;
        ListNode first=head.next;
        while(first!=null)
        {
            cur.next=prev;
            prev=cur;
            cur=first;
            first=first.next;
        }
        cur.next=prev;
        return cur;
    }

}