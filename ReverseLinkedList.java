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
import java.util.LinkedList;
class ReverseLinkedList {

    // Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: I used a previous, current, and ahead pointer with previous
    //pointer pointing to prev node, current pointing to current node and ahead pointing to next node. Then I ran a while loop
    //where I swapped the addresses of the above mentioned pointers.

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode ahead = head.next;
        while(ahead != null){
            current.next = prev;
            prev = current;
            current = ahead;
            ahead = ahead.next;
        }
        current.next = prev;
        return current;
    }
}