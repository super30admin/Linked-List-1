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
    public ListNode reverseList(ListNode head) {
        // base
        if(head == null || head.next == null) return head;

        // logic
        ListNode reversed = reverseList(head.next);
        // st.pop() every recursive call
        head.next.next = head;
        head.next = null;
        return reversed;
    }
}