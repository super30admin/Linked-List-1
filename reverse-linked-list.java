
// TC = O(N)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
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
        // TC = O(N), SC = O(N) (Recursive stack)
        // base
        // if(head == null || head.next == null) return head;
        // // logic
        // ListNode reversed = reverseList(head.next); // fixing the reversed list at last to return as it is not part of the recursion, hence fixed, equivalent to global var
        // System.out.println();
        // head.next.next = head;
        // head.next = null;
        // return reversed;

        // TC = O(N), SC = O(1)
        // null
        if(head == null || head.next == null) return head;
        ListNode prev = null, curr = head, fast = head.next;
        while(fast != null) {
            curr.next = prev;
            prev = curr; 
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}