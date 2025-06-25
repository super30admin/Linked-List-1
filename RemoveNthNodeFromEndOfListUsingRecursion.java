// Time Complexity : O(n), where n is the number of nodes in the linked list
// Space Complexity : O(n), due to recursion stack
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// This solution removes the Nth node from the end of a singly linked list using recursion.
// A dummy node is added before the head to handle edge cases, such as when the head node needs to be removed.
// The recursive helper function traverses to the end of the list, then counts nodes as it backtracks.
// When the count reaches n+1 (meaning the next node is the Nth from the end), we skip that node.
// Finally, we return dummy.next to ensure the correct head is returned even if the head was removed.

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
    int count;
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //If only one node; return null;
        if(head.next == null) return null;

        this.count = 0;

        //Create dummy node at start to handle edge case: if nth node to remove is the head
        ListNode dummy = new ListNode();
        dummy.next = head;

        //Recurse
        helper(dummy,n);

        return dummy.next;
    }

    private void helper(ListNode curr, int n){
        //End of the list; start counting
        if(curr.next == null){
            count++;
            return;
        }

        //Recurse
        helper(curr.next, n);

        //Increment count
        count++;

        //Remove the nth element
        if(count == n+1){
            ListNode temp = curr.next;
            curr.next = temp.next;
            temp.next = null;
        }

        return;

    }
}