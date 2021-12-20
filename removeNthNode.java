//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode actual = start, current = start;
        actual.next = head;

        for(int i=0;i<n+1;i++)
            current = current.next;

        while(current!=null){
            current = current.next;
            actual = actual.next;
        }

        actual.next= actual.next.next;

        return start.next;

    }
}
