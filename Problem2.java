/**Given a linked list, remove the n-th node from the end of list and return its head.

Example:

Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?
 */

// Time Complexity : O(n) time for both optimal and brute force(only pass will differe)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Approach- This problem can be handled in two ways: Optimal solution and Brute force
//Interviewer will ask the optimal one as it requires 1 single pass
//single pass means we have to traverse the linked list only once while removing n-th node
//while brute force requires 2 pass- first we traverse the list and then secondly we find the length
//Optimal solution-Two pointers approach

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //edge case
        if(head == null) return null;
        //assign dummy node to first node. Use two pointers approach
        //maintain slow and fast pointers starting from 0 index and maintain the window of length l
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        int count = 0;
        //iterate fast pointer until count is less than equal to n
        while(count <= n){
            fast = fast.next;
            count++;
        }
        //considering fast pointer don't leads to null
        //iterate both slow and next pointers
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}