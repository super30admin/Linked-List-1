//Time complexity: O(N)
//Space Complexity: O(1)
//Leetcode: Yes
public class ReverseLinkedList {

     /* Definition for singly-linked list. */
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverseList(ListNode head) {

            if (head == null) {
                return head;
            }

            ListNode prev  = null, temp = null;
            ListNode curr = head;

            while (curr != null) {
                prev = curr;
                curr = curr.next;
                prev.next = temp;
                temp = prev;
            }

            return temp;
        }
    }
}
