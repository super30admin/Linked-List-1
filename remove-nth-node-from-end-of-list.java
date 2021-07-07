// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //edge case
        if(head == null || head.next == null)
            return null;
        
        //logic
        ListNode dummyNode = new ListNode(0);
        dummyNode.next=head;
        ListNode first=head, second=dummyNode;
        int count=0;
        while(count < n)
        {
            first=first.next;
            count++;
        }
        while(first != null)
        {
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummyNode.next;
    }
}