


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/**
 *  Time Complexity - O(n)
 *  Space Complexity - O(1)
 *
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;
        ListNode nNodes = dummy;
        int i = 0;
        while(i < n){
            nNodes = nNodes.next;
            i++;
        }

        while(nNodes != null && nNodes.next != null){
            nNodes = nNodes.next;
            curr= curr.next;
        }

        curr.next = curr.next.next;

        return dummy.next;
    }
}