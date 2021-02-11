// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        // use two pointers fast and slow 
        // move slow one step and fast two step
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
                    
            // if there is loop fast and slow will meet
            if (fast == slow){
                
                // if they meet take a new pointer to head 
                // and move temp and slow until they meet and that is point of cycle
                ListNode temp = head; 
                while (temp != slow){
                    slow = slow.next;
                    temp = temp.next;
                }
                
                return slow;
            }
        }
        return null;
    }
}
