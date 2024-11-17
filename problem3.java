// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:

/*
 * Approach:
 * 1. We use Floyd's Cycle Detection algorithm (also known as the "tortoise and hare" algorithm)
 *    to detect a cycle in the linked list.
 * 2. We initialize two pointers, `slow` and `fast`, both pointing to the head of the linked list.
 * 3. `slow` moves one step at a time, while `fast` moves two steps at a time.
 * 4. If there is a cycle in the linked list, `slow` and `fast` will eventually meet.
 * 5. Once a cycle is detected (i.e., `slow` and `fast` meet), we reset `slow` to the head of the
 *    linked list and move both `slow` and `fast` one step at a time until they meet again.
 *    The meeting point is the start of the cycle.
 * 6. If there is no cycle, we exit the loop and return null.
 */
public class problem3 {

  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


    public ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        //  int count=0;
        while(fast!=null && fast.next!=null)
        {
            // if(count==0)
            // {
            slow= slow.next;
            fast= fast.next.next;
            // }

            if(fast== slow)
            {
                slow= head;
                while(slow!=fast)
                {
                    fast = fast.next;
                    slow= slow.next;
                }
                return slow;

            }
        }
        return null;
    }
}
