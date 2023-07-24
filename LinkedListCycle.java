package LinkedListI;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = true;
                break;
            }
        }
        if(flag)
        {
            slow = head;
            while(slow != fast)
            {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
        else return null;
    }
}
