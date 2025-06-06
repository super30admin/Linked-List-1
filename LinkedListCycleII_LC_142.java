
/*
Time complexity of two pointers approach [Optimal] - O(N)
Space complexity of two pointers approach [Optimal] - O(1)
Did this code successfully run on Leetcode :  Yes
Any problem you faced while coding this :  No
Brute Force : in Hashset add nodes if not present in hashset, if its present then return the node because thats where the cycle lies.  TC- O(N), SC- O(N)
Optimal Approach - First find the cycle in the list, then move head and slow, when slow meets head, thats the start of the cycle!
 */

 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class LinkedListCycleII_LC_142 {

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                break;
        }
        if(fast == null || fast.next == null)
            return null;

        while(head != slow){
            slow = slow.next;
            head = head.next;
        }

        return slow;
    }
}


