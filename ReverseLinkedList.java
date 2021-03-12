//Time complexity: O(n)
//Space complexity: O(n)
//Executed on leetcode.

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
        if(head==null)
            return null;
        ListNode temp=null;
        ListNode result=head.next;
        while(head.next !=null)         //reversing the list connections. 
        {
            head.next=temp;             //Making 1->2 as 1<-2;
            temp=head;
            head=result;
            result=result.next;
            
        }
        head.next=temp;
       
       /* ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;*/
        return head;
    }
}