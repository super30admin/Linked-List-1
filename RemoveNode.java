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

// Time Complexity :  O(N) as there is traversal of all nodes in LL
// Space Complexity : O(1) as no extra space is used and only pointers are used
// Did this code successfully run on Leetcode : Yes

class RemoveNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
         ListNode newhead = new ListNode(0); // Insert a dummy node in the beginning of head to handle edge case of just on node in the beginning
    newhead.next = head;
    ListNode first = newhead;
    ListNode second = newhead;
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 1; i <= n + 1; i++) {
        first = first.next;
    }
  
    while (first != null) {   // Move first to the end, so second lands at exact position before where node needs to be removed
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next; // remove next element of second by skipping it
    return newhead.next;
        
    }
}