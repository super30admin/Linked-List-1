// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :Noo


// Your code here along with comments explaining your approach
// In this approach we keep chaging the direction of current pointing to next to next pointing to current but everytime we do this we first store
// the next node in a temp so that we dont loose the next when we change the direction of pointer .
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
      
      ListNode prev = null;
      ListNode current = head;
      
      while(current != null)
      {
    	  //put the next in a temp so that we dont lose it
        ListNode temp = current.next;
        //change the direction to point to prev
        current.next = prev;
        //move prev and current to the next nodes
        prev = current;
        current= temp;
        
      }
      return prev;
        
    }
}