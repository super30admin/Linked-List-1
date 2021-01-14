// Time Complexity : The time complexity is O(n) where n is the number of nodes
// Space Complexity : The space complexity is O(1)
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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

        // Move the fast pointer to Nth position
        for(int i=0;i<n;i++){
            fast = fast.next;
        }

        // Move till fast is null, so that the slow pointer stops at Nth position from the end
        while(fast != null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }

        if(slow == head){
            return slow.next;
        }

        prev.next = slow.next;
        return head;

    }
}