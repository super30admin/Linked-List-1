// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmp = new ListNode(0);
        tmp.next = head;
        ListNode first = tmp;
        ListNode second = tmp;
        while(n > 0){
            second = second.next;
            n--;
        }
        while(second.next!=null){
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
        return tmp.next;
    }
}