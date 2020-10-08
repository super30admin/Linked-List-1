// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes, 0ms
// Any problem you faced while coding this : No, I had done this problem before


// Your code here along with comments explaining your approach

// Basic idea is reverse the link between the elements while iterating through the LinkedList and in the end assigning the head to the end of the list.

class Solution {
    public ListNode reverseList(ListNode head) {
       
    ListNode current = head;
    ListNode prev = null;
    ListNode next = null;
        
    while(current != null){
        
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
    }
        
    head = prev;
        
    return prev;
}
}