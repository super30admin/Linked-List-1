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
    /*
    Time complexity: O(n)
    Space complexity: O(1)
    */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // assign a dummy node before the head of the LL
        // to handle the edge case where only 1 node is there in a list
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // move the fast ptr ahead by n
        while(n > 0){
            fast = fast.next;
            n -= 1;
        }
        // then start moving both the slow as well as the fast ptr
        // until the end of the list is reached
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        // now the slow ptr has reached the prev element
        // after which the actual node is to be removed
        slow.next = slow.next.next;
        
        // return the head of the LL
        return dummy.next;
    }
}