// Time Complexity : O(n) //n-number of nodes
// Space Complexity : O(1)
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
        
        if(head==null)
            return null;
        
        ListNode t = null;
        ListNode curr = head;
        ListNode nex = head.next;
        
        while(curr!=null && nex!=null)
        {
            curr.next = t;
            t = curr;
            curr = nex;
            nex = nex.next;
        }
        
        curr.next = t;
        
        return curr;
        
    }
}