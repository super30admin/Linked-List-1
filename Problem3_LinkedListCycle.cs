// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode DetectCycle(ListNode head) {
        if(head == null) return head;

        ListNode slow = head;
        ListNode fast = head.next;
        bool isCycleFound = false;

        while(fast != null && fast.next != null) {
            slow = slow.next; //Move slow pointer by 1 node
            fast = fast.next.next; //Move fast pointer by 2 nodes
            if(slow == fast) { //Until slow and fast pointers meet
                isCycleFound = true;
                fast = head; //Reset fast pointer to head
                break;
            }
        }
        if(isCycleFound) { //If there is a cycle in the list, find the node at which the cycle starts
            while(slow != fast) {
                slow = slow.next; //Move slow pointer by 1
                if(slow == fast) { //If slow and fast pointers meet, return the node
                    break;
                }
                fast = fast.next; //Else move fast pointer by 1
            }
        return slow;
        }

        return null;  //If there is no cycle found, return null
    }
}