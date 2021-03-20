// Time Complexity : O(n) for both approaches where n here is number of nodes
// Space Complexity : O(n) recursion stack  for recursive approach, O(1) for iterative approach
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
---------------------------------------------------------------------------Approach 1 ----------------------------------------------------------------
  class Solution {
    public ListNode reverseList(ListNode head) {
      //Base condition
        if(head==null || head.next==null){
            return head;
        }
        
      //recursive call
        ListNode rest = reverseList(head.next);
      //assiging element back to it using next of next approach
        head.next.next=head;
      //for last node in reverse
        head.next=null;
        return rest;
    }
}

-----------------------------------------------------------------------------Approach 2----------------------------------------------------------------------------------
  //Iterative
  class Solution {
    public ListNode reverseList(ListNode head) {
      //Initially node before head is null
        ListNode prev=null;
        ListNode next;
        ListNode curr=head;
        
        while(curr!=null){
            next = curr.next;//pointing next pointer to node next
            curr.next=prev;//to keep track backwards
            prev=curr;//to increase/move the pointer
            curr=next;//curr can be null as next can be null
        }
        
        return prev;//final head of returned linked list
    }
}
