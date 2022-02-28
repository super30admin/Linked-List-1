x/**
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

        ListNode fast = head ;
        ListNode slow = head ;
        ListNode dummy = new ListNode();
        // ListNode abc = new ListNode();
        // System.out.println(fast.next.next);
        for (int i=0 ; i<n ; i++)
        {
            fast = fast.next;

        }
        if(fast==null)         // to handle the case when n == total number of nodes in linkedlist eg : n=1 and there is just 1 node
            return head.next;

        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;



    }
}