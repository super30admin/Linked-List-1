// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/*
We create a space difference of n between slow pointer and fast pointer and then move them one at a time
till fast pointer hits null
*/
class RemoveNthPointer{
    public static ListNode removeNthFromEnd(ListNode head, int n) {
     
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count=0;
           ListNode fastPointer=dummy;
           ListNode slowPointer=dummy;
           while(count<=n)
           {
               fastPointer=fastPointer.next;
               count++;
           }
          
           while(fastPointer!=null)
           {
               slowPointer=slowPointer.next;
               fastPointer=fastPointer.next;
               
               
           }
          
           slowPointer.next=slowPointer.next.next;
          
            return dummy.next;
            
        }
        public static void main(String[] args)
        {
            ListNode head=new ListNode(1);
            head.next=new ListNode(2);
            head.next.next=new ListNode(3);
            head.next.next.next=new ListNode(4);
            head.next.next.next.next=new ListNode(5);
            ListNode newHead=removeNthFromEnd(head,2);
            while(newHead!=null)
            {
                System.out.print(newHead.val+" ");
                newHead=newHead.next;
            }
    
            
        }
}