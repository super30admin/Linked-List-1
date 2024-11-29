// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Use fast pointer to travel first N nodes, then traverse fast and slow pointers at same speed.
// slow will point to node to be deleted. 
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

        ListNode fast = head;
        ListNode slow = head;

        for(int i = 0; i< n; i++){
            fast = fast.next;
        }
        
        // condition for if n == length of linked list
        if(fast == null){
            return head.next;
        }

        // move slow at the position of removal
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        
        // delete nth node
        slow.next = slow.next.next;
        return head;
    }
}