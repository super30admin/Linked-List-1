// Time Complexity :O(n) 
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        
        return previous;
    }
}