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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //base case
        if( head == null || head.next == null ) return head;
        //logic
        ListNode reversed = reverseList(head.next); //recursion
        //st.pop() -> behind the scenes
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}