// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach
// reverse a linkedlist iterative approach

class Solution {
    public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next); // traverses till the end of the linkedlist
        head.next.next = head; // once reaches the end it reverses the chain
        head.next = null;       // makes breaks the link
        return p;
    }
}