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
// Time Complexity: O(n) as we are traversing all the values
// Space Complexity: O(1) as no additional data structure is used
// Did you complete it on leetcode: Yes
// Any problems faced: No

// Write your approach here
// As we need to reverse we need to have track of the previous node, current node and next node to pass.
// updating the current node's next pointer to point towards previous node we can reverse the linked list itself, while also moving to next node.
// when head becomes null, previous pointer is pointing to last element in initial list.
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while(head!=null) {
            ListNode curr = head.next;
            head.next = prev;
            prev = head;
            head = curr;
        }
        return prev;
    }
}