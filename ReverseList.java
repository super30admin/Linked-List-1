//Iterative Approach

// Time Complexity : O(n), traversing in one pass
// Space Complexity : O(1), only using pointers
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english : Keep three pointers to move forward while reference links intact.


// Your code here along with comments explaining your approach

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
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp;

        while(curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}

// Recursive Approach:
// Time Complexity : O(n), traversing through whole linked list.
// Space Complexity : O(n), Rescurive stack space
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english : Using recursion stack point curr.next.next to curr(head);

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

    public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode newHead = helper(head);
        // head.next = null;
        return newHead;
    }

    private ListNode helper(ListNode head) {
        if (head.next == null) return head;

        ListNode newHead = helper(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
