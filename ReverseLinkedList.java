// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next==null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = head.next;
        
        while(next!=null){
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
            cur.next = prev;
        }
        return cur;
    }
}