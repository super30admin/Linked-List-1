/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*Algorithm:
    1. We take 2 pointers.
    2. We move forward by moving the slow ptr at one speed and the fast ptr at double the speed. If they meet we know there is a cycle.
    3. Now, To get the location at which cycle is happening we reset slow pointer to head and then move both fast and slow ptr at one speed. When they meet, the node at which they meet is place where cycle is happening.
    
    Time Complexity: O(n)
    Space Complexity: O(1)
    
    Did the code run on leetcode? Yes
*/
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)
            return null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        boolean cycle = false;
        
        while(fast!=null && fast.next!=null){ //Condition to check if there is no cycle
           
                slow = slow.next;
            fast= fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
                
            }
            
        }
        
        if(!cycle)
            return null;
        
        slow = head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
       
        return slow;
    }
}