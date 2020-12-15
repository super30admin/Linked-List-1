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
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null)
            return null;
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode start = dummy;
        ListNode end = dummy;
        for(int i=0;i<=n;i++)
        {
            end = end.next;
        }
        
        while(end!=null)
        {
            start = start.next;
            end = end.next;
        }
        ListNode extra = start.next;
        start.next = start.next.next;
        if(extra!=null)
        {
            extra.next=null;
        }
        return dummy.next;
    }
}
