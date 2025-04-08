// Time Complexity : O(N) because we traverse all the nodes
// Space Complexity : O(1) no extra space we do everything inplace
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We use three pointers to track prev, curr and curr.next and simply adjust the nodes

class Solution {
    public ListNode reverseList(ListNode head) {

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
}