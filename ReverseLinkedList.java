// Time Complexity : O(n) where n is the number of nodes in the linked list
// Space Complexity : O(1) as we are using constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


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
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public ListNode recursiveReverseList(ListNode head) {
        // recursive
        if(head == null || head.next == null){
            return head;
        }

        ListNode res = recursiveReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}