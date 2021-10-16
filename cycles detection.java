//	Timecomplexity:- O(n^2);
//Space complexity:-O(1);
//Did it run on leetcode:- Yes.
//What were the problems faced while doing it?:- got many times time limit exceeding.
//:- Your code with explanation:- from floyd warshal algorithm if cycle exists,then slow pointer will meet fast pointer at some time. based on this idea at meeting point iterating from start and return head when head=slow.









public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null){
            return null;
        }
        
        while((fast!=null)&&(fast.next!=null)){
            slow=slow.next;
            fast=fast.next.next;
        
       if(fast==slow){
           while(head!=slow){
               slow=slow.next;
               head=head.next;
             }
             return slow;
       }
            
        }
        
    return null;}
}