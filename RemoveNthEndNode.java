// Time Complexity : O(n), traversing in one pass
// Space Complexity : O(1), only using pointers
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english : Keep two pointers with difference of n between them and move them forward. When fast reaches null, slow will be at n+1th node from end. 
//Remove the next node from the list.


// Your code here along with comments explaining your approach

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
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;
        int count = 0;

        // keep differences of n b/w slow and fast
        while( count <= n && fast != null){
            fast = fast.next;
            count++;
        }

        // slow will be at n-1th element 
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode temp = slow.next;
        slow.next = temp.next;
        temp.next = null;

        return dummy.next;
    }
}