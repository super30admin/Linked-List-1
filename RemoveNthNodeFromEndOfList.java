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

// Most efficient one pass solution
// TC: O(N) -> no. of nodes in linked list
// SC: O(1)
// Did it run sucessgully on Leetcode? : Yes
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if ( head == null)
            return null;
        ListNode dummy = new ListNode(-1);  // use dummy pointer for edge cases like [1] , n = 1. If [1] gets deleted then reference to head is lost, so it gives null pointer exception
        dummy.next = head;       
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        while ( count <= n)
        {
            count++;
            fast = fast.next;
        }
        while ( fast != null)
        {
         slow = slow.next;
         fast = fast.next;
        }   
        slow.next = slow.next.next;
       return dummy.next;
    }
}



