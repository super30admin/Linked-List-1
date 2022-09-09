// # Linked-List-1

// ## Problem1 (https://leetcode.com/problems/reverse-linked-list/)


  //Definition for singly-linked list.
  public class Problem1 {
      int val;
      Problem1 next;
      Problem1() {}
      Problem1(int val) { this.val = val; }
      Problem1(int val, Problem1 next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public Problem1 reverseList(Problem1 head) {
        // O(n) time
        // O(1) space
        
        if (head == null || head.next == null) return head;
        Problem1 prev = null;
        Problem1 curr = head;
        Problem1 fast = head.next;
        while (fast!= null) {
            curr.next = prev;
            prev = curr;
            curr = fast;
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
}