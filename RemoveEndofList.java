// Time Complexity : O(L), L being number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


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
        ListNode ptr1 = head;
        ListNode ptr2 = ptr1;
        ListNode prev = null;
        
        // edge case
        if (ptr1.next == null) return null;
        
        for (int i = 0; i < n; i++){ // distance between ptr1 and ptr2 are by n
            ptr1 = ptr1.next;
        }
        
        while (ptr1 != null){ // maintain gap until reach end - ptr now potining at nth node from the end
            ptr1 = ptr1.next;
            prev = ptr2;
            ptr2 = ptr2.next;
        }
        
        if (prev == null) return ptr2.next;
        prev.next = ptr2.next;
        return head;

    }
}