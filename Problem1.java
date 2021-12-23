//space complexity : o(1)
//time complexity : o(n)
public class Problem1 {
    public ListNode reverseList(ListNode head) {
        if(head==null){return null;}
         ListNode prev=null;
         ListNode current = head;
         ListNode fast = head.next;
         while(fast!=null){
             current.next=prev;
             prev=current;
             current=fast;
             fast=fast.next;
         }
         current.next=prev;
         return current;
     }
}
