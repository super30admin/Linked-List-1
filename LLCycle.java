//Time Complexity- O(n)
//Space Complexity- O(1)
//Successfully ran on leetcode


public class Solution {
 public ListNode detectCycle(ListNode head) {
     
     if(head==null) return null;
     
     ListNode slow= head;
     ListNode fast= head;
     boolean isCycle= false;
     
     while(fast!=null && fast.next!= null){
         
         slow= slow.next;
         fast= fast.next.next;
         
         if(fast== slow){
             isCycle= true;
             break;
         }
     }
     
     if(isCycle!=true){
         return null;
     }
         slow= head;
         while(fast!=slow){
             slow=slow.next;
             fast= fast.next;
         }
      
     
     return slow;
     
 }
}