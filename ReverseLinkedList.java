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

 /* 1: Iterative approach
 Time: O(n)
 Space: O(1)
 Did this code successfully run on Leetcode : yes
 */
class Solution {

    public ListNode reverseList(ListNode head) {

        ListNode prev=null, curr=head;

        while(curr!=null){

            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}

/*Approach 2:  Using recursion
 Time: O(n)
 Space: O(n) - size of recursion stack
 Did this code successfully run on Leetcode : yes
 */
class Solution {

    ListNode newHead;
    public ListNode reverseList(ListNode head) {

        if(head==null||head.next==null)
            return head;

        helper(head);

        return newHead;

    }
    public void helper(ListNode head){

        if(head.next==null){
            newHead=head;
            return;
        }
        helper(head.next);
        head.next.next=head;
        head.next=null;
    }
}