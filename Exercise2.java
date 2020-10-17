/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null)return null;
        ListNode temp=head,temp2=head;
        int count=0;                                                                                                    
        while(temp2.next!=null)
        {
            temp2=temp2.next;
            count++;
            if(count>n)temp=temp.next;
        }
        if(count<n)return head.next;
        if(temp.next.next!=null)temp.next=temp.next.next;
        else temp.next=null;
        return head;
    }
} 