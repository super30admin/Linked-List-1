/**
Problem: Reverse a linked list
Did it run on LeetCode : Yes
Time Complexity: O(n), where n is the number of nodes in the linked list.
Space Complexity: O(1)

Approach 1 : Iterative Solution
1. Traverse till the end of the linkedlist.
2. Keep a track of the previous node, and make the next of the current node to point to the previous.
3. Now, update the previous node and current node.

Approach 2 : Same approach, but recursive solution.
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

//Solution 1 : Iterative 
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}

//Solution 2: Reverse
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
}
