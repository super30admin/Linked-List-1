// Time Complexity : O( max(maxNum, n) )
// Space Complexity : O( max(maxNum, n) )
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
      val = x;
      next = null;
  }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {
        // null case
        if(head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false; //to check if cycle exists or not
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        fast = head;
        while(slow != fast){
            slow= slow.next;
            fast = fast.next;
        }
        return fast;
    }
}