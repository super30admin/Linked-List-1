// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Use dummy node to point to head and take two pointers p1 and p2 pointing to that dummy node.
// iterate p2 to n and now iterate the list with both the pointers with n-distance till p2 reaches the end.
// Now delete the element after p1 and point it to p1.next.next
// Dummy node helps in the edge case like only one element is present in the list and is asked to delete that one.
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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        for(int i=0;i<n;i++){
            p2 = p2.next;
        }


        while(p2.next!=null){
            p2 = p2.next;
            p1 = p1.next;
        }
        p1.next = p1.next.next;
        return dummy.next;
    }
}