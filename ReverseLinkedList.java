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

 // This solution uses a iterative approach where prev start from a null element and curr start from head. At each iteration, we reverse the link of the list to opposite side and move forward both curr and prev
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null) {
            // Save the next element address
            ListNode temp = curr.next;
            // relink the chain to prev to reverse the direction
            curr.next=prev;
            // move both prev and curr
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
