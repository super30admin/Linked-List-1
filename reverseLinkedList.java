// Time Complexity : O(n) -> iterating over entire linkedlist
// Space Complexity : O(1) -> Just pointers and dummy node, no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


//reversing with the help of three pointers
class Solution {
    public ListNode reverseList(ListNode head) {
        //base case
        if(head == null || head.next == null){
            return head;
        }

        //initiailizing our pointers
        ListNode prev = null;
        ListNode current = head;
        ListNode fast = current.next;

        while (fast != null){
            current.next = prev;
            prev = current;
            current = fast;
            fast = fast.next;
        }
        current.next = prev;
        return current;

    }
}