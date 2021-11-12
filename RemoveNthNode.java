//Time Complexity: O(n)
//Space Complexity: O(1)

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
        ListNode itr = head;
        ListNode prev;

        for(int i=0;i<n;i++)
            itr = itr.next;

        if(itr==null)
            return head.next;
        prev = head;
        while(itr.next!=null){
            prev = prev.next;
            itr = itr.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}