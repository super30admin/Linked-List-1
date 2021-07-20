//time- O(N): #nodes
//space- O(1)

//using 3 pointers
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev= null;
        
      //  ListNode curr= head;
        while(head!=null){
            
            ListNode next= head.next;
            
            head.next= prev;
            
            prev= head;
            
            head= next;
        }
        
        return prev;
        
    }
}