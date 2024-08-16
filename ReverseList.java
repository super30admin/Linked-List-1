// Problem 206. Reverse Linked List
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
class ReverseList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while(current != null){
            // next node
            ListNode next = current.next;
            // reverse pointer
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
