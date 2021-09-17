// Time Complexity : O(n), We traverse through all nodes once.
// Space Complexity : O(1), No extra space is created in reversing the linked list.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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
//base case
        if(head==null)return head;
//Initializing three nodes at null, current and current.next
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;
//logic
        while(fast!= null){
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
//One last node left out from the loop
        curr.next = prev;
//returns the answer
        return curr;
    }
    
    
}
