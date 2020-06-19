// Time Complexity : O(n), n is number of nodes
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :



//check if linkedlist has cycle first 
//to detect cycle use slow and fast pointer : slow moves 1 node, fast moves 2 node 
//if cycle present, (use flag) 
//point slow to head 
//then move both slow and fast by one node
// they will meet at start of cycle (return either slow / fast )
//if no cycle return null

public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        int flag = 0; 
        
        //check is ll has cycle
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if(slow == fast) {
                flag = 1;
            }
            
            //set slow to head and break
            if(flag == 1) {
                slow = head; 
                break;
            } 
        }
        
        //move both fast and slow by 1 to find start of cycle 
        if(flag == 1) {
            //to check if both are at head
            if(slow == fast) return slow;
            else {
            while(fast != null && fast.next != null) {
                fast = fast.next;
                slow = slow.next; 
                if(slow == fast) {
                    return slow; 
                }
            }
            }
        }
        
        return null; 
        
    }
}

