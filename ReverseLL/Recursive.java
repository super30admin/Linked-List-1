package ReverseLL;

// Time Complexity : O(n)
// Space Complexity : O(n)  Each recursive call adds a new frame to the call stack until curr becomes null
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Recursive {
    ListNode result;

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        helper(head, null);

        return result;
    }

    private void helper(ListNode curr, ListNode prev)
    {
        //  bsae

        if(curr == null) {
            result = prev;
            return;
        }

        // logic
        ListNode temp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = temp;

        helper(curr, prev);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}