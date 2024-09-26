/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
Time Complexity: O(n)
Space complexity: O(1)
Did the code run on leetcode? Yes
Iterative Approach: Three pointer approach is used. While the fast node runs till the end of the list, point curr.next node to prev, move prev to curr and curr to fast and then fast to fast.next. connect curr.next to prev after the fast reaches null for the last element.

*/
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode fast = head.next;

        while(fast!=null){
            curr.next = prev;
            prev = curr;
            curr = fast; 
            fast = fast.next;
        }
        curr.next = prev;
        return curr;
    }
} 