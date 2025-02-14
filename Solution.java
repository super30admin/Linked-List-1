// Problem3 (https://leetcode.com/problems/linked-list-cycle-ii/)

// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, take two pointers slow and fast starting at head. Slow moves 1 time and fast moves 2 times and when they first meet says that there is a
 * cycle. Now, to detect the starting point of the cycle, reset fast to head and move 1 time at once. When they again meet return slow pointer.
 * This is the index at which cycle starts. 
 */

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
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                flag= true;
                break;
            }
        }
        if(!flag) return null;
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}