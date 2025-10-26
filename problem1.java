// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/*
 * Appraoch
 * 
 * we are using 3 pointer
 * To track the current node, previous node and the next node
 * we will start at prev at null as we use prev to make cur point backwards
 * we will itterate one at a time makeing them point other the prev so that 
 * after the end of itteration, it will be reversed
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode fast = cur.next;
            cur.next = prev;
            prev = cur;
            cur = fast;

        }
        return prev;

    }
}