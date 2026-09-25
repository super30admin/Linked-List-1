/*
Approach 
Use three pointers: prev, current, and next to reverse each link.
Save current.next, point current.next to prev, then move both pointers forward.
Continue until the list ends; prev becomes the new head.

Time Complexity: O(n)
Space Complexity: O(1)
*/
class ReverseLinkedListIte {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {

            ListNode next = current.next;

            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }
}

