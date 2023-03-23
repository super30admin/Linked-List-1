// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
 * We put elements into the stack using recursion. The last but one element gets popped first which points to the last element. 
 * Turning head.next.next to head, changes head and then we remove the connection by turning it into null. 
 * We return the reversed node pointing to head. 
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if( head == null || head.next == null){
                return head; 
        }
        ListNode reversed = reverseList(head.next);
        head.next.next = head; 
        head.next = null; 
        return reversed; 
    }
}