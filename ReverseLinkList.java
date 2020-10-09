// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {

    public ListNode reverseList(ListNode head) {

        if(head == null)
        {
            return head;
        }

        ListNode prev = null;

        while(head != null)
        {
            ListNode curr = head.next;
            head.next = prev;
            prev = head;
            head = curr;
        }
        return prev;
    }
}
