/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null) return head;
        ListNode prev = null;
        ListNode current = head;
        ListNode temp = current.next;

        while(temp!= null)
        {
            current.next = prev;
            prev= current;
            current = temp;
            temp = temp.next;
        }
        current.next = prev;
        return current;
    }
}