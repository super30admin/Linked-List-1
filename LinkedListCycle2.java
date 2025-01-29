// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// Use two pointers, fast and slow to detect cycle

public class LinkedListCycle2 {
       class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

        public ListNode detectCycle(ListNode head) {
            ListNode current = head;
            ListNode slow = current, fast = current;

            if(head == null){
                return null;
            }

            while(fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    slow = head;
                    return calculateStart(slow, fast);
                }
            }
            return null;
        }

        public ListNode calculateStart(ListNode slow, ListNode fast){
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
}
