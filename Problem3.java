// ## Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)


 // Definition for singly-linked list.
 // O(n) time
// O(1) space
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Problem3 {
    public ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }
        
        if (!flag) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}