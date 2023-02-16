// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
//traverse untill last using 2 pointers and remove other
//by tracking the distance between them

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode actual = head;
        ListNode ans = head;
        for (int i = 0; i < (n); i++)
            head = head.next;
        if (head == null)
            return actual.next;
        while (head.next != null) {
            head = head.next;
            ans = ans.next;
        }
        if (ans.next == null)
            return null;
        if (ans.next.next == null)
            ans.next = null;
        else
            ans.next = ans.next.next;
        return actual;
    }
}