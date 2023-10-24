// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :N/A

// Your code here along with comments explaining your approach
// Used prev, curr and temp pointers to keep track of previous node, current node and node ahead of current node
// In this way curr points to prev and it gets updated on every iteration with the help of temp
// This is how linked list is reversed.

class ListNode {
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

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode temp = null;
        ListNode prev = null;
        ListNode curr = head;
        temp = curr.next;
        while (temp != null) {
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
        }
        curr.next = prev;
        return curr;
    }
}