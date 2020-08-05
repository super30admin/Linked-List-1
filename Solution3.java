// Leetcode 142. Linked List Cycle II
/** 3 Pointer Approach: 
 *  Implemented Floyd's Tortoise and Hare sol (fast and slow runner): 
    1. first phase will determine whether a cycle is present in the list.
    2. If no cycle is present, it returns null. Otherwise, uses located "intersection node" to find the entrance to cycle.
    3. The FAST pointer will run with 2x and slow will run with 1x.
    4. If there is no cycle, null be returned, incase slow and fast meets at a point we found teh cycle.
    5. Once cycle is found - restart the slow pointer from HEAD and continue the fast pointer, but both with 1x speed.
    they will definately meet and the point they meet wil be the result.
 */  
//
//time Complexity :
// O(N)

// Space Complexity :
// O(1)

// Did this code successfully run on Leetcode : YES.
// Any problem you faced while coding this : NO.

public class Solution3 {
    public ListNode detectCycle(ListNode head) {
        
        if(head == null) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
                slow = head;
                
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                
                return slow;
            }  
            
        }
        
        return null;
    }
}