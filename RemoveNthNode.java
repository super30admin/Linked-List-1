// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = new ListNode(0);
        curr.next = head;
        ListNode p = curr;
        ListNode q = curr;

        for (int i = 0; i < n + 1; i++) {
            p = p.next;
        }

        while (p != null) {
            p = p.next;
            q = q.next;
        }


        q.next = q.next.next;

        return curr.next;

    }
}
