/*
    - node -> node -> node 
    - 
*/

public class ReverseLinkedList {
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
    public ListNode reverseList(ListNode head) {
       
        if(head == null || head.next == null) return head;

        ListNode result = reverseList(head.next);
        //st.pop

        //backtrack
        head.next.next = head;
        head.next = null;
        return result; 
    }
}
}
