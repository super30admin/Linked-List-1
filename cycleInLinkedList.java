// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

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
        //starting both slow and fast pointers at head
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow= slow.next;
            fast = fast.next.next;
            //if slow and fast pointers meet, cycle is present
            if(slow == fast){
                flag = true;
                break;
            }
        }
            if(!flag) return null;
            fast = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
        return fast;
        //return slow; either works
    }
}
