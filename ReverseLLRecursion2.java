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
    ListNode reversed;
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        
        helper(head);
        return reversed;
}

private void helper(ListNode head)
{
    //base condition
    if(head.next == null)
    {
        reversed = head;
        return;
    } 

    //recurssion
    helper(head.next);

    //action
    head.next.next= head;
    head.next = null;

}
}
