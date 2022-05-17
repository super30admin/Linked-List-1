//Time complexity: O(N)
//Space Complexity: O(1)
//Leetcode: Yes
public class RemoveNthNodefromEND {

    /**
     * Definition for singly-linked list.
     */
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode slow = head;
            ListNode fast = head;
            ListNode temp = null;
            while (n > 0) {
                fast = fast.next;
                n--;
            }

            while (fast != null) {
                fast = fast.next;
                temp = slow;
                slow = slow.next;
            }
            //if temp == null we know we are removing the head node so take care of that.
            if (temp != null) {
                temp.next = slow.next;
            } else {
                head = slow.next;
            }

            return head;

        }
    }
}
