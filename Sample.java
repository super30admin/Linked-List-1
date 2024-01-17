// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // System.out.println(slow.val + " " + fast.val);
        // System.out.println("----------------");

        if(head == null) return null;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            // System.out.println(slow.val + " " + fast.val);
            if(slow == fast) break;
        }

        if(fast.next == null || fast.next.next == null) return null;
        // System.out.println("----------------");
        // System.out.println(slow.val + " " + fast.val);
        slow = head;

        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        // System.out.println(slow.val + " " + fast.val);

        if(slow == fast) return slow;
        return null;
    }
}
