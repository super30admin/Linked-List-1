/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Time Complexity : O(n) -> iterating through the entire list
// Space Complexity : O(1) -> no additional space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
* Iterate through the list using curr pointer and at each step try to reverse the direction of the pointer
* Save the next of the current pointer into a temp node so that we dont lose track of that
* Return prev as that will be the new head
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){

            // because I am going to lose track of curr.next once I point the curr to prev list
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }
}

// recursive solution
/*
 * take the advantage of the recursive stack and use that to keep track of the current node
 *  We iterate through the list till the last node and assign the next head from head.next.next and send the new result
 * TC: O(n)->iterating through the list SC: O(n)-> recursive stack space
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        // head == null will be activated when the list is empty
        if(head == null || head.next == null) return head;

        ListNode result = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return result;

    }
}