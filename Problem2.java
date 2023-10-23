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

//Problem - Remove Nth node from the end
//Time Complexity - O(n) where n is the number of nodes in linked list
//Space Complexity - O(1) we are using constant amount of extra space
//Code run successfully on Leetcode - Yes

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    
        ListNode fast = head;
        ListNode slow = head;

        // Move the fast pointer N nodes ahead
        for (int i = 0; i < n; i++) {
        fast = fast.next;
        }

        // If fast reached the end, remove the head
        if (fast == null) {
            return head.next;
        }

        // Move both pointers until fast reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the Nth node from the end
        slow.next = slow.next.next;

        return head; 
    } 
}