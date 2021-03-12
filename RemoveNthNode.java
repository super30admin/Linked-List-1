// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// In this approach we take a dummy node at the beginning of the linked list . We use two pointers and we move one pointer to a node n away from the 
// dummy. After this we start incrementing the pointers and we will reach a point where the p2 will have a null as next at that moment , we would have
// reached the node that is to be removed and we directly point the p1 to next.next.
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
      
      
      ListNode dummy = new ListNode(-1);
      dummy.next = head;
      ListNode p1 = dummy;
      ListNode p2 = dummy;
      
      //moving p2 to n nodes away from the dummy
      while(n>0)
      {
        p2 = p2.next;
        n--;
      }
      
      //start incrementing p2 until we reach the last node
      while(p2.next!=null)
      {
        p1 = p1.next;
        p2 = p2.next;
      }
      //the node that is next to p1 is the one that is to be removed and we make the current point to next.next
      p1.next=p1.next.next;
      return dummy.next;
    }
}