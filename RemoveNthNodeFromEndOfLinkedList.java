package S30.LinkedList;


/*  Successfully executed on leetcode

    Time complexity: O(n) though we are using 2 pointers we will be only traversing list once
    Space Complexity: O(1) no extra space is used.

    Approach: using 2 pointer approach to maintain a window. Pointer 1, pointer r start at dummy
               which is before head, pointer 2 till n elements after head. Then we iterate
               both pointers till
* */


  class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class RemoveNthNodeFromEndOfLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode p1 = dummy, p2 = dummy;
        while(n > 0){
            p2 = p2.next;
            n--;
        }

        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }

        p1.next = p1.next.next;
        return dummy.next;
    }
}