// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Couldn't solve before class


// Your code here along with comments explaining your approach
//use two pointers: slow and fast. Increment slow by 1, fast by 2, so that eventually they will meet is cycle is present
//when cycle detected, initialize slow to head.
//increment slow and fast by 1 until they are not equal
//return slow/fast

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null) return head;
        
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                slow = head;
                
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next; 
                }
               
                 return slow;
            }
        }
        
       return null;
    }
}