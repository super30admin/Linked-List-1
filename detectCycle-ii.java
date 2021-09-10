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

//Time complexity: O(n) : O(2n) 2 ignores, but equals as O(n)
/* For acyclic lists, hare will reach the end of the list in n/2 
  iterations, causing the function to return before another phase. Therefore, it runs in time linearly proportional to the number of nodes : O(n) */
//Space Complexity: O(1)
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
    
        while (fast != null && fast.next != null) {
           slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag = true;
                break;
            }   
       }
        if(!flag) return null;
        //find beginning of cycle
        fast = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;      
    }
    return slow;
    }
}