// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class ReverseLinkedList {
  
  public ListNode reverseList(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    
      while(curr != null){
          ListNode temp = curr.next;
          curr.next = prev;
          prev = curr;
          curr = temp; 
      }
      
      return prev;   
  }
}