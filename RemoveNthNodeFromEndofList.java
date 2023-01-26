// Time Complexity: O(n)
// Space Complexity: O(1)

/*
 * move the fast pointer n steps ahead and then start the slow 
 * pointer. reach the end and make next of slow pointer as next.next.
 */

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
        
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int count = 0;
        ListNode fast = dummy;
        ListNode slow = dummy;

        while(count <= n){
            fast = fast.next;
            count++;
        }

        while(fast!= null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}