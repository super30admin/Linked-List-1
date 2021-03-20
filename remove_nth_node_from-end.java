// Time Complexity : ~O(n) for both approaches
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
-------------------------------------------------------------------- Approach 1 --------------------------------------------------------------------
   class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        
        //Go until n-1th node from start
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        
         // This will take care of edge case, when there is only one element or when 2nd element fro tail is deleted from list of 2 elements
        if(fast==null){
            head=head.next;
            return head;
        }
        
        //Go until end from fast pointer and move slow pointer as well
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
      //before our node position make before node point to next of our intended node.
        slow.next=slow.next.next;
        return head;
    }
}
-------------------------------------------------------------------- Approach 2 ---------------------------------------------------------------------------
  //Dummy-node concept
  class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Dummy-node concept
        
        //This will take here when there is only one node or when we are deleting 2nd element from list of 2 elements
        ListNode newNode = new ListNode(10);
        newNode.next = head;
        head = newNode;
        
        ListNode fast = newNode;
        ListNode slow = newNode;
        
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        
        // if(fast==null){
        //     head=head.next;
        //     return head;
        // }
        
        //Edge-cases
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next=slow.next.next;
        return newNode.next;
    }
}
