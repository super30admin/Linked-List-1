// Time Complexity : O(n)
// Space Complexity : Iterative = O(1) && Recursion = O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class ReverseLinkedList {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

      // ITERATIVE
        public ListNode reverseListIterative(ListNode head) {
            ListNode temp1;
            ListNode temp2 = null;
            while(head != null)
            {
                temp1 = head.next;
                head.next = temp2;
                temp2 = head;
                head = temp1;
            }
            return temp2;
        }
        //REVERSED

        private ListNode reverseList(ListNode head) {
            return reverse(head);
        }
        private ListNode reverse(ListNode head) {
            //base
            if(head == null || head.next == null) {
                return head;
            }
            //logic
            ListNode reversed = reverse(head.next);
            head.next.next = head;
            head.next = null;
            return reversed;
        }
}
