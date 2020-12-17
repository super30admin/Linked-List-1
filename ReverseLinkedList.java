// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NA


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
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null) {
            return head;
        }
        Stack<ListNode> s = new Stack<>();
        
        while(head.next != null) {
            s.push(head);
            head = head.next;
        }
        
        ListNode reversed = head;
        
        while(!s.isEmpty()) {
            head = s.pop();
            head.next.next = head;
            head.next = null;
        }
        
        return reversed;
    }
}