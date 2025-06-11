/*
Time Complexity: O(N) where N is the number of nodes in the linked list.
Space Complexity: O(1) since we are using two pointers and not using any extra space.
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
Intuition: We can reverse the linked list by iterating through the list and changing the next pointer of each node to point to the previous node. We maintain a previous pointer that starts as null and a current pointer that starts at the head of the list. As we iterate, we keep track of the next node and reverse the link.
*/

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next_node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_node;
        }

        return prev;

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
