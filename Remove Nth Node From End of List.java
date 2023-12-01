// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


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
        ListNode dummy = new ListNode();
        dummy.next= head;
        ListNode fast=dummy;
        ListNode slow= dummy;

        while(n>0)
        {
            fast=fast.next;
            n--;
        }

        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;

        }
       ListNode temp=slow.next;
        slow.next=slow.next.next;
        temp= null;

        return dummy.next;
    }
}