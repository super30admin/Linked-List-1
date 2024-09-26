// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
          if (head == null) {
            return head;
        }
       ListNode slow=head;
        ListNode fast =head;
        
        while(fast != null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
            
        if(slow ==fast){
            slow =head;  
        
            
        while(slow!=fast){
            slow =slow.next;
            fast=fast.next;
        }        
         return slow;
        }
    }
        return null;
}
}