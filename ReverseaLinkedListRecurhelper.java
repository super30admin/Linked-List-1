public class ReverseaLinkedListRecurhelper {

        ListNode end;

        public ListNode reverseList(ListNode head) {

            if(head == null || head.next == null) return head;

            recursion(head, null);

            return end;
        }

        private void recursion(ListNode curr, ListNode left) {

            //base
            if(curr.next == null) {

                end = curr;

                end.next = left;

                return;
            }

            //logic

            ListNode right = curr.next;

            curr.next = left;

            recursion(right, curr);
        }

}
