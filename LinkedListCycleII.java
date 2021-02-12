package S30.LinkedList;

/*  Successfully executed on leetcode
    Time complexity: O(n)

    Space complexity: O(1)

    Approach: used Floyd's two pointer algorithm
* */


class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1(int x) {
          val = x;
          next = null;
      }
  }

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head, dummy = head;
        while(fast!= null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                while(dummy != slow){
                    dummy = dummy.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}
