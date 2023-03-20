// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Initially, I take a dummy node and assign it as null. I set slow ptr to head and fast ptr to head.next. I now traverse through the linked
 * list till fast is not null and I set slow.next to dummy. Then I assign dummy as slow and fast to fast.next. After the loop ends, I set
 * slow.next to dummy and return slow.
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
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode dummy = null;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null)
        {
            slow.next=dummy;
            dummy=slow;
            slow=fast;
            fast=fast.next;
        }
        slow.next=dummy;
        return slow;
        
    }
}