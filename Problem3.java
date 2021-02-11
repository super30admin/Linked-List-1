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

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Y
// Any problem you faced while coding this : N


// Your code here along with comments explaining your approach
    Floyds algo- increment 2 pointers until equal. Reset one pointer & iterate by one until equal again to find start of cycle.

public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode first = head;
        ListNode second = head;
        boolean isCycle = false;

        while(second!=null && second.next!=null){
            first = first.next;
            second = second.next.next;
            if(first==second){
                isCycle = true;
                break;
            }
        }

        if(!isCycle){
            return null;
        }

        first = head;

        while(first!=second){
            first = first.next;
            second = second.next;
        }

        return first;
    }
}