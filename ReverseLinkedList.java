// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public ListNode reverseList(ListNode head) {
        // check for empty linked list
        if(head == null) return null;
        // check for single element
        if(head.next == null) return head;
        // intialize pointers
        ListNode slow = null;
        ListNode current = head;
        ListNode fast = head.next;
        // iterate through the linked list
        while(fast != null){
            // keep swapping the pointers and reverse the list
            current.next = slow;
            slow = current;
            current = fast;
            fast = fast.next;
        }
        // for the last element left
        current.next = slow;
        // return the new head
        return current;
    }
}