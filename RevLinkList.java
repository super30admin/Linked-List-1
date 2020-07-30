/**
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
  //Nope

// Your code here along with comments explaining your approach
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode cur = head;
        ListNode nxt = head.next;

        while(cur != null){
            //reverse.
            cur.next = prev;

            //move prev, cur and nxt.
            prev = cur;
            cur = nxt;
            if(nxt != null)
                nxt = nxt.next;
        }
        return prev;
    }
}
