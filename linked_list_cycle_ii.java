// Time Complexity : O(n), where n is the number of node in the linkedlist
// Space Complexity :O(1), no extra space is used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

//Three liner explanation of your code in plain english
//1. Take 2 pointers (slow and fast) starting at the head. move slow pointer at 1x and fast pointer at 2x speed and stop when slow
        //and fast meet
//2. Move either slow or fast to the head, and start moving both the poninters by 1x speed. Stop when 2 pointer meet (as this is the
        // starting node of the cycle) --> as the distance where the slow and fast meet (moving at 2x speed) from the starting node of cycle 
        //will be same as the distance from the head to the starting node of cycle
//3. Return either slow OR the fast pointer, as both will be at starting node of the cycle 

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
        //if head is null return null
        if(head == null) return null;
        
        //assign two pointer at the head, slow moves by 1x and fast moves by 2x speed
        ListNode slow = head;
        ListNode fast = head;
        
        //move slow by 1 and fast by 2
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            //once slow at fast meet, that means there is a cycle, so either move slow or fast back to the start(head) to find the starting node of the cycle;
            if(slow == fast){
                slow = head;
                break;
            }
        }
        
        //if fast is null OR fast's next is null, meaning there is no cycle so return null
        if(fast == null || fast.next == null) return null;
        
        //move slow and fast by one till they meet, the position they meet is the starting node of the cycle
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        
        //return either slow OR fast as both point to the starting node of cycle
        return slow;
    }
}