// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Take two pointer prev and cur
//Run cur till it reaches null
//Keep the next of cur in some variable
//Point next of cur to prev
//Assign prev to cur and then cur to next
//Repeat this to have a reverse ll, retur prev which would be the new head.

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            
        }
        return prev;
    }
}