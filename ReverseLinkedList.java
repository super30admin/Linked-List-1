// Time Complexity :O(n) n is number of nodes in LinkedList
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public ListNode reverseList(ListNode head) {
        
       if(head == null) return null; 
       ListNode curr = head;
       ListNode prev = null;
       ListNode next = head.next;
        
        while(next!=null)
        {
            curr.next = prev; // Current pointer points to the prev
            prev = curr;   // Prev moves to current
            curr = next ;  // Current moves to next node
            next = next.next; // next moves further ahead
        }
        
        curr.next = prev;
        return curr;
        
    }
}