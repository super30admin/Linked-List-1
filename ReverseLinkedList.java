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

// Iterative Solution
// TC: O(n)
// SC: O(1)
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr!= null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}



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

//Recursive Solution
//TC: O(n)
//SC: O(1)
class Solution {
    ListNode result;
    public ListNode reverseList(ListNode head) {
        helper(head);
        return result;
    }

    private void helper(ListNode head) {
        // base case
        if(head == null || head.next == null) {
            result = head;
            return;
        }
        // logic
        helper(head.next);
        head.next.next = head;
        head.next = null;
    }
}