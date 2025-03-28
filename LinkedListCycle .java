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
// Overall Time Complexity : O(n) + O(n) since both fast and slow traverse the list once and again after resetting the pointers they travel the linked list again (worst-case )
// Overall Space Complexity : O(n) for the recursive stack space used for the function call on each node in linked list
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No issues faced during implementation


// Detects if a cycle exists in the linked list and returns the node where it begins.
// Two pointers are used to find the meeting point and then locate the start of the cycle.


public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        //base condition
        if(head == null || head.next==null){
            return null;
        }

        boolean flag = false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                flag = true;
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