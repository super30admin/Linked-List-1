// Time Complexity :  O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        boolean isCycle = false;
        while(fast != null && fast.next != null){ //We will check where the fast and slow pointers match while traversing the list
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                isCycle = true;
                break;
            }
            //If they match at some point we will terminate the iteration and will set the flag as true 
        }
        
        if(!isCycle) return null; //If slow and fast don't match, so no cycle in the LinkedList
        
        
        fast = head; //Set value of any pointer at head of the list
        while(slow != fast){    // Traversing the list by 1 element using both slow and fast pointers
            slow = slow.next;
            fast = fast.next;
        } //When they match, we got the head of list where the cycle begins , return slow/fast as both will be having same value
        
        return slow;
    }
}