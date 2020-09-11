// Problem 1 - Reverse Linked List
// Time Complexity : O(n) where n = number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YEs
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Algorithm
// 1 - initiliaze result listnode
// 2 - while condition
// 3 - temp listnode with head
// 4 - point temp to result
// 5 - result equals temp
// 6 - point to next node
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
  public ListNode reverseList(ListNode head) {
    // 1
    ListNode result = null;
    
    // 2
    while (head != null) {
      // 3
      ListNode temp = new ListNode(head.val);
      // 4
      temp.next = result;
      // 5
      result = temp;
      // 6
      head = head.next;
    }

    return result;
  }
}
