// Time Complexity : O(N) N=number of elements  in  the List. Two iteration are O(n) + O(n)
// Space Complexity : O(1) no extra space used.
// Any problem you faced while coding this :


// We use floyd to detect if there is a cycle, if there is one we use head to find the start of cycle.   
//Success
//Details 
 //  Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
//Memory Usage: 37.7 MB, less than 6.37% of Java online submissions for Remove Nth Node From End of List.

 public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null || n<=0)
            return head;
        int nElements= countNElements(head);
        ListNode tmp= head;
        int endIter=nElements-n-1;
        for (int i=0;i<endIter;i++){
          tmp=tmp.next;   
        }
        if (endIter<0)
          head=tmp.next;
         else
           tmp.next=tmp.next.next;
        return head;
    }
    private int countNElements(ListNode head){
        ListNode current=head;
        int i=0;
        while (current!=null){
            i++;
            current=current.next;
        }
        return i;
    }