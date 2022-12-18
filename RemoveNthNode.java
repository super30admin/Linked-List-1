// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


public class RemoveNthNode {

    /**
 * Definition for singly-linked list.*/
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        while (cnt <= n && fast != null){
            fast = fast.next;
            cnt++;
        }

        while (fast != null){
            fast= fast.next;
            slow = slow.next;
        }
        if (slow.next == null){
            slow.next = null;
        } else {
            slow.next = slow.next.next;
        }
        return dummy.next;
        
    }
}
    

