// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Use 3 points: prev, curr, next
 * Point the prev to null, change the next to curr.next 
 * Now change the current next to prev and previous to current and move current to next
 */
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       ListNode next = head;
       while(curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
           

       }
       return prev;
    }
}