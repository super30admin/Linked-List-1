/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null || head.next ==null)
        {
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = head.next;
        while(temp!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = temp;
            temp = temp.next;
            
            
        }
        curr.next =prev;
        return curr;
        
    }
}
