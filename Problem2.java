// ## Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)


  //Definition for singly-linked list.
  public class Problem2 {
      int val;
      Problem2 next;
      Problem2() {}
      Problem2(int val) { this.val = val; }
      Problem2(int val, Problem2 next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public Problem2 removeNthFromEnd(Problem2 head, int n) {
        if (head == null) return null;
        Problem2 dummy = new Problem2(-1);
        dummy.next = head;
        
        Problem2 slow = dummy;
        Problem2 fast = dummy;
        
        int count = 0;
        while (count <= n){
            fast = fast.next;
            count++;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return dummy.next;
    }
}