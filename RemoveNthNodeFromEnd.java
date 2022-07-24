// Time Complexity : O(n) - Asymptotic time notation as we only parse through the lenght of the linkedlist
// Space Complexity : O(1) No extra space is used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//This is the Approach that came to my mind Initially

class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode len = head;
        int length = 0;
        // Finding the Length of the List
        while (len != null) {
            length++;
            len = len.next;
        }
        // If there is only one node, just return the empty node
        ListNode ret = null;
        if (length == 1) {
            return ret;
        }

        // Reverse the given Linked List and get the head of reversed List
        len = head;
        ListNode revHead = reverse(len);
        ListNode curr = revHead;
        int i = 1;

        // Now Parse until the given nth node. and delete that node
        // Pointing the previos node of the given nth node to nth next
        // That's how we delete that node
        while (curr != null && i <= length) {

            if (i == 1 && n == 1) {
                curr.val = curr.next.val;
                curr.next = curr.next.next;
                break;
            } else if ((i == n - 1)) {
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
            i++;
        }

        // After deleting the node, reverse the list back to its original and return its
        // head
        ret = reverse(revHead);

        return ret;

    }

    // Function to reverse the LinkedList
    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = head.next;

        while (next != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next = prev;
        return curr;
    }

}