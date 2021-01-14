// Time Complexity : The time complexity is O(n) where n is the number of nodes.
// Space Complexity : The space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


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

//Recursive Solution
class Solution {

    ListNode newHead;

    public ListNode reverseList(ListNode head) {

        reverse(head,null);
        return newHead;

    }

    public void reverse(ListNode head,ListNode prev){

        if(head == null){
            newHead = prev;
            return;
        }

        reverse(head.next,head);
        head.next = prev; // The prev head node is made the next node of current node

    }
}

// Iterative Solution
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while(head != null){

            // The prev node is assigned as current nodes next
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;

        }

        return prev;

    }
}