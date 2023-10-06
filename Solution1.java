// Leetcode Problem : https://leetcode.com/problems/reverse-linked-list/description/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
 * I take two additional pointers slow and fast that are equal to null initially. I traverse through the list while head!=null,
 * In each iteration, I set slow to fast, fast to head and head to head.next. I then set fast.next to point to slow. At the end, I return
 * fast.
 */
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
        ListNode slow = null;
        ListNode fast = null;
        while(head!=null)
        {
            slow = fast;
            fast = head;
            head = head.next;
            fast.next = slow;
        }
        return fast;
    }
}