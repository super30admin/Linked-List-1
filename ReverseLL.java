// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public ListNode reverseList(ListNode head) {

        // If there is only one node - no need to reverse - Just return
        if (head == null || head.next == null) return head;

        // Maintain 2 pointers
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            // Persist next pointer and reverse
            ListNode temp = curr.next;
            curr.next = prev;

            // Move
            prev = curr;
            curr = temp;

        }

        // Return new Head
        return prev;
    }
}

// Recursive approach
    /*
    public ListNode reverse(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode newHead = reverse(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
     */