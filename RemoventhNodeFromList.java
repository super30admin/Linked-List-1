// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
Compute the overall size of the linked list and get the difference of the size and n to get the node
before the required node to be deleted. We iterate to reach that node position by decrementing the difference
variable.Now, we establish connection using next pointers and delete the required node.
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
        ListNode curr = head;
        int size = 0;

        while(curr != null) {
            curr = curr.next;
            size++;
        }

        curr = head;
        size = size - n;

        if(size == 0)
            return head.next;

        while(size > 1) {
            curr = curr.next;
            size--;
        }
        curr.next = curr.next.next;
        return head;
    }
}