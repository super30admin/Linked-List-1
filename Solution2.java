// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
/*
 * I created a new dummy node and made it point to head. Initially, I set slow and fast pointers to be equal to the dummy node. Now I 
 * iterate through the list and increment fast to fast.next n times so that the distance between slow and fast pointers become n.
 * Then I increment both slow and fast pointers till fast.next doesn't become null. Now I set slow.next to slow.next.next and return
 * dummy.next.
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}