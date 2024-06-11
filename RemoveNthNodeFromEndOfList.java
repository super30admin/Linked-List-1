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

// Time Complexity : O(n) => As we iterate over the n nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. In the while loop added wrong condition. Instead of count < n added count <= n

/*
Approach: Used slow, fast pointer and a count variable. Initially moved fast pointer until
count < n. Then start moving both slow and fast pointer until fast != null & fast.next != null. At this point slow will be at the previous node of the node to be removed. Used dummy node
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null){
            return null;
        }

        ListNode dummy = new ListNode(-1, head); // Used incase we are expected to remove the 1st node

        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;

        while(count < n){
            count = count + 1;
            fast = fast.next;
        }

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}