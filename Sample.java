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

// Problem 2 - Remove Nth Node From End of List
// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YEs
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Algorithm
// 1 - initiliaze dummy linked list
// 2 - initiliaze 2 pointers
// 3 - loop to point p2 at correct position
// 4 - loop to get p1 pointed at its correct position now
// 5 - p1.next == p1.next.next
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
  public ListNode removeNthFromEnd(ListNode head, int n) {
    // 1
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    // 2
    ListNode p1 = dummy;
    ListNode p2 = dummy;
    // 3
    while (n > 0) {
      p2 = p2.next;
      n -= 1;
    }
    // 4
    while (p2.next != null) {
      p1 = p1.next;
      p2 = p2.next;
    }
    // 5
    p1.next = p1.next.next;
    return dummy.next;
  }
}

// Problem 3 - Linked List Cycle II
// Time Complexity : O(n) where n = length of linked list
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YEs
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// Algorithm
// 1 - initiliaze slow and fast pointer
// 2 - loop until null
// 3 - slow moves by 1 node
// 4 - fast moves by 2 nodes
// 5 - break when slow equals fast
// 6 - check if fast is null
// 7 - again point slow to head
// 8 - loop until slow equals fast
// 9 - return fast
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
  public ListNode detectCycle(ListNode head) {
    if(head == null || head.next == null) return null;
    // 1
    ListNode slow = head;
    ListNode fast = head;
    // 2
    while(fast != null && fast.next != null){
      slow = slow.next; // 3
      fast = fast.next.next; // 4
      // 5
      if(slow == fast){
          break;
      }
    }
    // 6
    if(fast == null || fast.next == null) return null;
    // 7
    slow = head;
    // 8
    while(slow != fast){
      slow = slow.next;
      fast = fast.next;
    }
    // 9
    return fast;
  }
}
