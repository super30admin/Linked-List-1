// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

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
        ListNode slow = dummy; ListNode fast = dummy;
        // create the appropriate gap
        int count=0;
        while(count <= n){
            fast = fast.next;
            count ++;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        // when fast == null -> slow is at the prev node of the node to be deleted
        slow.next = slow.next.next;
        return dummy.next;
    }
}