//Reverse Linked List
//TC:O(n)
//SC:O(n)
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
class Solution2 {
    public ListNode reverseList(ListNode head) {

        //base case
        if(head==null  || head.next==null)
        {
            return head;
        }
        ListNode prev=null;
        ListNode curr=head;
        ListNode temp=head.next;

        while(temp!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=temp;
            temp=temp.next;            
        }
        curr.next=prev; //at last node
        return curr; //new head of reverse list      
    }
}