package S30.LinkedList_1;

/*
Time Complexity : O(n) - 2 pass algorithm
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

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

        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        ListNode intersection = getIntersectionNode(slow,fast);
        if(intersection == null) return null; // no cycle

        slow = head;
        fast = intersection;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;


    }

    //Method finds where the slow and fast pointers intersect. If they don't, there is no cycle
    public ListNode getIntersectionNode(ListNode slow, ListNode fast){

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return slow;
            }
        }
        return null;
    }
}
