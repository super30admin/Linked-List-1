//Time complexity: O(n)
//Space complexity: O(1)
//Executed on leetcode

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
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slowP = head;
        ListNode fastP = head;
        
        while(fastP!=null &&fastP.next!=null)
        {
            slowP = slowP.next;
            fastP = fastP.next.next;        //Slow pointer moves one step and fast pointer moves 2 steps if there is a loop. slow meets fast.
            if(slowP == fastP)				// From here head and slow are at same distance to the point where cycle forms. 
            {
                ListNode dummy = head;		//Based on this logic return the linked list from point of cycle. 
                while(dummy!=slowP)			//If fast pointer reaches end before meeting slow. then there is no cycle.
                {
                    dummy = dummy.next;
                    slowP = slowP.next;
                }
                
                return slowP;
            }
            
        }
        
        return null;
    }
}