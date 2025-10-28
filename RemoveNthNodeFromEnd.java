// Time Complexity : O(n).
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Approach : To remove nth node form end, we should maintain a gap of n elements between the two pointers. We start fast pointer and reach the n and then
// start moving slow and fast until the end. Now slow is right before the n and now we swap the next pointers and remove the nth node.

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        int count = 0;
        dummy.next = head; //pointing dummy to head

        ListNode slow = dummy;
        ListNode fast = dummy;


        while(count <= n){ // moving fast pointer until n
            fast = fast.next;
            count++;
        }

        while(fast != null){// move both
            slow = slow.next;
            fast = fast.next;
        }

        //remove the nth node linkage
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;
    }
}