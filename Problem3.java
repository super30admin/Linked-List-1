
//Space complexity : o(1)
//Time complexity : o(n)
public class Problem3 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
         
         if(head.next==null && n==1){
             return null;
         }
                
         int size=0;
         ListNode temp = head;
         while(temp!=null){
             size++;
             temp=temp.next;
         }
         int deleteIndex=size-n;
         temp=head;
         //Edge case if we need to delete the first element
           if(deleteIndex==0){
             temp=temp.next;
             return temp;
         }
         int idx=0;
         while(idx<deleteIndex-1){
            temp=temp.next;
             idx++;
         }
         temp.next=temp.next.next;
         return head;
     }
}
