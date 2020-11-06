package Nov5;

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
    
    public ListNode RemoveNthNodeFromEndOfList(ListNode head, int n) {
                        
/*

 Time complexity = O(n) 
 Because in worst case, we may have to go till the last node to delete it if n = 1.
  
 Space complexity = O(1)
 Because no extra space used.
 
 Did this code successfully run on Leetcode : Yes

 Any problem you faced while coding this : No

Approach:
  Slow and fast pointers approach used.
  Fast moved to n places and then start moving slow till fast reaches end of list (null).
  Prev pointer moves one place behind slow pointer and it is used for deletion of node.
  Result pointer is used to hold reference for original list's head pointer.
 
*/
        
        // edge case
        if (head == null ) {
            return null;
        }
        
        ListNode result = new ListNode(-1);
        result.next = head;
      
        ListNode prev = null;
       // prev.next = head;
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        
        while (count < n) {
            count++;
            fast = fast.next; 
        }
        
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        
        // if first node in linked list is to be deleted => prev has never been moved.
        if(prev == null)
            return result.next.next;
        
        // deleting the node at slow pointer 
        prev.next = slow.next;
        
        return result.next;
        
    }
}