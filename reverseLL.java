// Time Complexity : O(n) where n is the no.of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// CODE 

class reverseLL{
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){  //if there is no node or only one node in ll
           return head;
       }
       ListNode prev  =null;  //Taking three pointers
       ListNode curr = head;
       ListNode next = head.next;

       
       while(next!=null){   //traversing through all nodes
           curr.next = prev; 
           prev = curr;
           curr = next;
           next = next.next;
       }
       curr.next=prev;  //at the end when next becomes null the last node will be left ;so reversing last node
       return curr;
   }
}