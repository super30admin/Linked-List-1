// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ReverseLLRec {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        return helper( previous, current);
    }
    private ListNode helper(ListNode previous, ListNode current){
        if(current.next==null)
        {
            current.next = previous;
            return current;

        }

        ListNode tmp = current;
        current =current.next;
        tmp.next = previous;
        return helper(tmp,current);
    }
}
