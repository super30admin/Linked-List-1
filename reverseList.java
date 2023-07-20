// Time Complexity : O(n), where n is the number of nodes in the linked list
// Space Complexity : O(1), no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/**
 * 1. Initialize three pointers, prev, curr and next. Assign curr and next to head and prev to null.
 * 2. Use curr and prev pointer to reverse the list and next pointer to travese the whole list.
 * 3. In the last step, prev will be at last node where curr and next will be null. Return prev.
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, next = head;
        while(curr != null){
            next = next.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}