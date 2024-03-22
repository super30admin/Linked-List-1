// Time Complexity : O(n) where 'n' is number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Approach 1, using three pointers, current, previous and future
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode future = null;
        ListNode prev = null;

        while( curr!=null){
            future = curr.next;
            curr.next = prev;
            prev = curr;
            curr = future;
        }
        return prev;
        
    }
}
//Approach 2: Using recursion
//O(n) O(n)
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result; 
    }
}