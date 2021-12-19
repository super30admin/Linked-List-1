// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


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
        /*Set<ListNode> cycle = new HashSet<ListNode>();
        while(head!=null) {
            if(cycle.contains(head)) {
                return head;
            }
            cycle.add(head);
            head = head.next;
        }
        return null;*/
        if(head == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        do {
            if(fast.next == null)
                return null;
            fast = fast.next;
            if(fast.next == null)
                return null;
            fast = fast.next;
            slow = slow.next;
        }while(slow != fast);
        
        fast = head;
        while(slow!=fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}