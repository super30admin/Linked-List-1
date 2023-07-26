//206. Reverse Linked List

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode curr = head.next;
        ListNode prev = head;
        prev.next = null;
        while(curr != null){
            ListNode temp = curr.next; 
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}