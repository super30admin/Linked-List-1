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

//Problem - Linked List Cycle II
//Time Complexity - O(n) where n is the number of nodes in linked list
//Space Complexity - O(1) we are using constant amount of extra space
//Code run successfully on Leetcode - Yes

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        boolean flag = false;

        //loop for checking if there is cycle or not
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }

        }
        if(!flag) return null; // returning for no cycle

        slow = head; //reset slow

        //loop for finding location of cycle
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}