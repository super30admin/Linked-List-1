// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        int count = 0;
        ListNode cur = dummy;
        ListNode end = dummy;
        while(count<=n){
            count++;
            end = end.next;
        }
        while(end!=null){
            cur = cur.next;
            end = end.next;
        }
        cur.next = cur.next.next;
        return dummy.next;
    }
}