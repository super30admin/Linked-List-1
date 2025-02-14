package ReverseLL;

// Time Complexity : O(n)
// Space Complexity : O(n) Each recursive call is stored in the function call stack until reaching the base case (last node). There are O(n) recursive calls in memory at once before they start returning.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
 * Using recursion we go till last element and then return that. We change the next pointer of head to null and make this returned node as the result.
 */

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, recursion is used for every head.next. While we reach the end of the list with condition either head or head.next is null we add thet
 * node to result. And for all the remaining node, point head.next.next to head which gives backward direction and head.next to null saying
 * there is no link in forward direction. Finally return result gives the reversed linked list.
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
class RecursiveWithout2Pointers {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = reverseList(head.next);
        // System.out.println(head.val);
        System.out.println(result.val);

        head.next.next = head;
        head.next = null;

        return result;
    }
}
