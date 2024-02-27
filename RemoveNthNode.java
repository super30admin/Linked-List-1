// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        int count = 0;
        ListNode fp = dummy;
        ListNode sp = dummy;

        while (count <= n) {
            fp = fp.next;
            count++;
        }

        while (fp != null) {
            fp = fp.next;
            sp = sp.next;
        }

        ListNode temp = sp.next;
        sp.next = temp.next;
        temp.next = null;

        return dummy.next;
    }

}
