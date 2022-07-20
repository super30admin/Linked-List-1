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

//Handle the case of only one element differently
//Time Complexity: O(n).
//Space Complexity: O(1).
// The trick here is the mathematical property of distance. The distance 2(a+b) = a+b+c+b; imagine it as a circle and define the point where they meet and the respective distances. 

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        boolean cycle = false;
        
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
               
        }

        if(cycle == false) return null;
        
        if(cycle == true){
            slow = head;
            while(fast != slow){
                slow = slow.next;
                fast = fast.next;
             }
        }
  
        return slow;
    }
}