// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Two Pointer approach 

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
        if(head == null)
            return head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        head.next = null;
        while(p2 != null){
            ListNode temp = p2.next;
            p2.next = p1;
            p1 = p2;       
            p2 = temp;
        }
        return p1;
    }
}
