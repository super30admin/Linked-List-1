//TC:O(length of linked list)
//SC:O(1)
//Successfully ran on leetcode
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
        ListNode dummy=new ListNode(-1,head);

        ListNode p1=dummy;
        ListNode p2=dummy;

        while(n>0 )
        {
            p2=p2.next;
            n--;
        }

        while(p2.next!=null)
        {
            p1=p1.next;
            p2=p2.next;
        }
        p1.next=p1.next.next;

        return dummy.next;
    }
}
