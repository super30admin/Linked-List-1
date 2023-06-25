public class ReverseaLinkedListIterative {

        public ListNode reverseList(ListNode head) {

            if(head == null || head.next == null) return head;

            ListNode left = null;
            ListNode curr = head;
            ListNode right = head.next;

            while(right != null) {

                curr.next = left;

                left = curr;

                curr = right;

                right = right.next;
            }

            curr.next = left;

            return curr;

        }

/* Time Complexity = O(1)
Space Complexity = O(1) */
}
