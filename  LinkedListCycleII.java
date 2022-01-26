// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
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
        
        //null check
        if(head == null) return null;
        ListNode slow = head; //initializing slow pointer at head
        ListNode fast = head; //initializing fast pointer at head
        boolean flag = false; 
        while(fast != null && fast.next != null){
            fast = fast.next.next; //moves by 2
            slow = slow.next; //moves by 1
            if(fast == slow){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        fast = head;
        while(fast != slow){ 
            fast = fast.next;
            slow = slow.next;
        }
        
        return slow;
    }
}