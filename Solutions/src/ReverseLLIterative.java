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
class ReverseLLIterative {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode current = head;
        ListNode previous = null;
        while(current.next!=null){
            ListNode temp = current;
            current = current.next;
            temp.next = previous;
            previous = temp;
        }
        current.next = previous;
        head = current;
        return head;
    }

}
