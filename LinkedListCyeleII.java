// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// In this approach we use a slow pointer and a fast pointer. We first keep both the pointer at the head. We then move the slow pointer by 1 and the fast pointer by 2. If there is
// a cycle then there will a point when the slow pointer and fast pointer will meet. At that point we move the slow pointer back to the head and start incrementing them by 1.
// Again if they meet , that is the node where the cycle begins.
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
      
      ListNode sp = head;
      ListNode fp = head;
      
      while(fp != null && fp.next != null)
      {
        sp = sp.next;
        fp = fp.next.next;
        
        if(sp == fp)
        {
          sp = head;
          while(sp!=fp)
          {
            sp = sp.next;
            fp = fp.next;
          }
            return fp;

        }
      }
      
      return null;
        
    }
}