// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

public class LinkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        Boolean hasCycle = false;
         ListNode slow = head;
         ListNode fast= head;
 
         while(fast!=null && fast.next!=null ){
             slow = slow.next;
             fast = fast.next.next;
 
             if(slow == fast) {
                 hasCycle = true;
                 
             }
         }
         if(hasCycle){
             fast= head;
                 //loop till fast = slow to find start of cycle
                 while(slow!=fast){
                     slow = slow.next;
                     fast = fast.next;
                 }
 
                 return slow;
         }
         return null;
 
         
     }
}
