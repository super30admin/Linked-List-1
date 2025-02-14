// Problem2 (https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * In this create a dummy node with value -1 or any other thing. Take 2 pointers slow and fast at dummy node. Take a counter and till count
 * reaches value of n, move fast pointer at pace of 1. while it reaches n increase both slow and fast pointers at pace of 1. While fast
 * poiner reaches null, the node next to slow is the element to be removes. Change slow.next to slow.next.next and return dummy.next i.e.,
 * linked list from head.
 */

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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast= dummy;
        int count = 0;
        while(count<=n){
            fast = fast.next;
            count++;
        }
        while(fast!= null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode temp = slow.next;
        slow.next = slow.next.next;
        temp.next = null;

        return dummy.next;

    }
}
