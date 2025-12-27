// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
//The concept of linked list reversal

// Your code here along with comments explaining your approach
//1. reversing th linked list is kind of like swapping the nodes
//2. set the temp to curr.next, set curr.next to prev(reversing the direction), set prev to curr(moving prev ahead), set curr to temp(moving curr ahead) 
//3. Do this till curr is null

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