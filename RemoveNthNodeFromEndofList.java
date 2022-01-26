//one pass solution that is iterating in LL in one go
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : forgot to initialize dummy.next = head


// Your code here along with comments explaining your approach
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
        ListNode dummy = new ListNode(-1); //instantiating dummy node at -1 index
        dummy.next = head; //next node after dummy is head
        ListNode slow = dummy; //2 pointers starting at dummy
        ListNode fast = dummy;
        int count = 0; //counter to  keep track of n
        
        while(count < n){
            fast = fast.next;
            count++;
        }
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        slow.next = slow.next.next; //skipping head and moving to next pointer 
        return dummy.next;
    }
}