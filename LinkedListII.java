// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
This program detects the starting point of a cycle in a linked list using two pointers moving at different speeds.
First, it checks if a cycle exists by moving one pointer one step at a time and the other two steps.
If they meet, a cycle is confirmed.
Then, one pointer is reset to the head, and both move one step at a time until they meet again, which will be the cycle's entry point.
 The solution runs in O(n) time and uses O(1) space, making it efficient.


*/
public class LinkedListII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                break;
        }
        if(fast==null || fast.next==null)
            return null;

        slow=head;
        while(slow!=fast)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
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