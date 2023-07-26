// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null; // Pointer to previous node
        ListNode curr = head; // Pointer to current node
        ListNode nextNode = null; // Pointer to next node

        while (curr != null) {
            nextNode = curr.next; // Save the next node
            curr.next = prev; // Reverse the link by pointing to the previous node

            // Move the pointers one step forward
            prev = curr;
            curr = nextNode;
        }

        return prev; // Return the new head of the reversed list

    }
}