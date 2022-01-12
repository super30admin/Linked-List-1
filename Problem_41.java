//Problem - 41

// Time Complexity : O(N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode :
//Yes

// Your code here along with comments explaining your approach 

class Solution {
    public ListNode reverseList(ListNode head) {
        // we will keep a prev node to track the current node passed and the current
        // node
        ListNode prev = null;
        ListNode curr = head;

        // while the current doesn't reach the end of the list, we keep updating
        // previous with reverse links
        while (curr != null) {
            ListNode curr_next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr_next; // also updating current with the curr_next every time
        }
        return prev;
    }
}