// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class ReverseLinkList {
    class Solution {
        public ListNode reverseList(ListNode head) {
            if(head==null || head.next==null)
                return head;

            ListNode prev = null;
            ListNode cur = head;
            ListNode next = head;

            while(cur != null){
                next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            return prev;
        }
    }
}
