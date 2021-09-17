// Time Complexity : O(n), We traverse once through the linked list.
// Space Complexity : O(1), No extra space is created.
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
        if(head==null)return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
// Initially finding out where the two pointer meet
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                flag = true;
                break;       
            }
        
        
        }
        if(!flag) return null;
//put fast = head pointer again and iterate both slow and fast by 1 each until they meet again.
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
// as per logic, they have to meet again only at the start of the cycle.
    }
}