// Time Complexity :O(N) where N is the number of nodes in the linked list
// Space Complexity :O(1) as we are using constant space
// Did this code successfully run on Leetcode :yES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
// Brute force is to use set.
// We will use three pointers, prev, curr and temp.
// We will initialize prev to null and curr to head.
// We will iterate through the linked list until curr is null.
// We will store the next node in temp and then reverse the link by pointing curr.next to prev.
// We will then move prev to curr and curr to temp.
// Finally, we will return prev as the new head of the reversed linked list.

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}