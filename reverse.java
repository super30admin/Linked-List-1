//Time Complexity: O(n) – each node is visited once
// Space Complexity: O(1) – reversal is done in-place using pointers

//Use three pointers: `prev`, `curr`, and `fast` to reverse links one by one.
//In each step, reverse `curr.next` to point to `prev`, then move all pointers forward.
//After the loop, point the last node’s `next` to `prev` and return it as the new head.

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null ||head.next ==null)
        {
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = curr.next;
        while(fast!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}