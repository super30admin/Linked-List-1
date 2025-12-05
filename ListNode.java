// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

//  Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        int count = 0;
        while(count <= n)
        {
            count++;
            fast = fast.next;
        }
        // now we have n distance between slow and fast pointers
        while(null != fast)
        {
            slow = slow.next;
            fast = fast.next;
        }
        ListNode toDelete = slow.next;
        slow.next = slow.next.next;
        toDelete.next = null; // to break away from the original linked list
        return dummy.next; // if head is returned then for edge case of removing first node will not work
    }
}