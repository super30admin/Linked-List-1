// Time Complexity : O(N) - As we traverse through the whole list
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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode p1 = null;
        ListNode p2 = head;
        ListNode temp;
        while(p2 != null)
        {
            temp = p2.next;
            p2 = temp;
            p1 = p2;
            p1 = p1.next;
            p2 = p2.next;
        }
        return head;
    }
}

// Your code here along with comments explaining your approach