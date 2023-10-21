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

 /* Time Complexity : O(n)
  *  n - lenghth of the linked list */
/* Space Complexity : O(1) */
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this :

//iterative solution

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
            //Initialize three pointers one at curr.prev, curr an curr.next 
            //and keep moving them ahead by 1X till the end of the list
            ListNode prev = null;
            ListNode curr = head;
            ListNode temp = head.next;
            //reverse the link for each pair of prev and curr
            while(temp != null){
                curr.next = prev;
                prev = curr;
                curr = temp;
                temp = temp.next;
            }
            curr.next = prev;
            return curr;
    }
}