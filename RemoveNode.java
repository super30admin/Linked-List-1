// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
first build a gap of n nodes between the slow and fast pointer and then traverse till the end
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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;

        int count=0;
        while(count<=n){
            fast=fast.next;
            count++;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp=null;

        return dummy.next;

    }
}
