/*
Approach

Recursively reverse the list from head.next onward until reaching the last node.
Make the next node point back to the current node using head.next.next = head.
Set head.next = null to remove the old connection and return the new head.

Time Complexity: O(n)
Space Complexity: O(n) — recursion stack.
*/

class ReverseLinkedListRec {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}