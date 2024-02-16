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
 // iterative approach:

//Three pointers, prev, curr, and fast, are initialized to null, head, and null respectively.
//In a while loop, the curr.next is reversed by pointing it to prev, and pointers are updated (prev, curr, and fast).
//After the loop, the reversed list's head is at prev, and it is returned.
//time Complexity: O(N) - The algorithm iterates through the list once.
//Space Complexity: O(1) - The algorithm uses a constant amount of extra space.
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode fast = null;
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }
        return prev;
    }
}