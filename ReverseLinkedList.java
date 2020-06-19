// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

// Approach:
//1) recursively call head.next till its null
//2) change the last node next to stack pop node and remove the pop next link

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode r = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return r;
    }
}
