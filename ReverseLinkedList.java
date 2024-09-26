// Time Complexity : O(N) N=number of elements  in  the List. 
// Space Complexity : O(1) no extra space used.
// Any problem you faced while coding this :


// We use 3 pointers  and iterative over the list and start reversion the list in place.   
//Success
//Details 
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
//Memory Usage: 39.1 MB, less than 5.04% of Java online submissions for Reverse Linked List.
    public ListNode reverseList(ListNode head) {
      if (head == null)
          return head;
      ListNode tmp=null, c=head, p=null;
      while (c!=null){
          tmp=c.next;
          c.next=p;
          p=c;
          c=tmp;
      }
      return p;  
    }