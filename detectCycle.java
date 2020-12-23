
// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

//Identify the cycle
//Famous hair and tortoise problem
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
        if(head == null || head.next==null)
             return null;
        ListNode slow = head;
        ListNode fast = head;
        boolean hasCycle = false;
         while(fast!= null && fast.next!=null){
             //jump once
             slow=slow.next;
             //jump twice
             fast=fast.next.next;
             if(slow==fast){
                 hasCycle = true;
                 break;
             }
         }
         if(!hasCycle){
             return null;
         }
         slow = head;  
         //Stopping condition 
         while(slow!=fast){
             slow=slow.next;
             fast=fast.next;
         }
        return fast;   
    }
}