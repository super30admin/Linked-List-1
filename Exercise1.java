/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null)return head;
        ListNode temp=head;;
        while(temp.next!=null)
        {
            ListNode i=temp.next.next;
            temp.next.next=head;
            head=temp.next;
            temp.next=i;
        }
        return head;
    }
}