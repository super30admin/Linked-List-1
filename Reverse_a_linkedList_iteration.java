// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no 


// Your code here along with comments explaining your approach
// reverse a linkedlist iterative approach

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, nxt = null;      // using the 3 pointer curr, previous, next approach
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}