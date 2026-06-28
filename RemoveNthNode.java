// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Find the length of the linked list using a dummy node.
// Compute the position of the node to remove and traverse to its previous node.
// Skip the target node by updating the previous node's next pointer.

class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyHead = new ListNode(-1, head);

        ListNode current = dummyHead;
        int length = 0;

        while(current != null) {
            length++;
            current = current.next;
        }

        int targetIndex = length - n + 1;
        int index = 1;
        current = dummyHead;
        while(index < targetIndex - 1) {
            current = current.next;
            index++;
        }
        current.next = current.next.next;
        if(index == 1) {
            head = current.next;
        }

        return head;
    }
}