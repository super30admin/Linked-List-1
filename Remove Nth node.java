// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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
        // initliaze dummy node at the start of the linked list
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        
        // initalize slow and fast pointers
        ListNode slow = dummy;
        ListNode fast = dummy;

         // initialze count
        int count = 0;

        // keep moving fast until difference between slow and fast is less than n
        while(count < n){
            fast = fast.next;
            count++;
        }
        
        // keep moving slow and fast together so that slow ends
        // up to n - 1 th element from end
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
        
    }
}