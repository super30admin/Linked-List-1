// Leetcode Problem : https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * I use a dummy node and set it to point to head. I set slow and fast to dummy. I traverse
 * through the list n times and increment fast to fast.next. I then loop till fast.next!=null 
 * and increment both slow and fast to slow.next and fast.next respectively. I then return 
 * dummy.next at the end.
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
        ListNode slow = dummy,fast = dummy;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return dummy.next;

    }
}