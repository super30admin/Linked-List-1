public class ReverseLinkedList {
    public class ListNode {
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

    /**
     * Time complexity - o(n)
     * Space complexity o(1)
     * Take 2 pointers prev and curr.
     * prev = null amd curr = head.
     * Keep assigning next node to current while assinging
     * current node to prev until current not null. what is last node.
     *
     *
     *
     *
     */

    class Solution {
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
}
