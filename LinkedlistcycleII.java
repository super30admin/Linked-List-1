// Time Complexity : O(N) N=number of elements  in  the List. 
// Space Complexity : O(1) no extra space used.
// Any problem you faced while coding this :


// We use floyd to detect if there is a cycle, if there is one we use head to find the start of cycle.   
//Success
//Details 
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II. Memory
 // Usage: 39.5 MB, less than 6.32% of Java online submissions for Linked List Cycle II.
   public ListNode detectCycle(ListNode head) {
      if (head==null)
          return head;
      ListNode slow=head;
      ListNode fast=head;
      while (fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
          if (slow==fast)
              break;
      }
      if (fast==null || fast.next==null)
          return null;
      return startOfCycle(head,slow);
  }


    private ListNode startOfCycle(ListNode head,ListNode intersec){
        while (head!=intersec){
            intersec=intersec.next;
            head=head.next;
        }
        return head;
    }