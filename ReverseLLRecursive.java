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

//tc- o(n)
//sc-o(1)
class Solution {
    ListNode reverse = null;
    public ListNode reverseList(ListNode head) {
       //basecase
        if(head == null || head.next == null) return head;
       //logic
       reverse = reverseList(head.next); //st.pop()
        //System.out.println(reverse.val);
        head.next.next = head;
        head.next = null;
        
        return reverse;
}
}