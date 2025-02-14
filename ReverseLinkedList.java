// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

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

/*
 * Using recursion we go till last element and then return that. We change the next pointer of head to null and make this returned node as the result.
 */
class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
         return reverse(head);
    }

    private ListNode reverse(ListNode head){
        //base
        if(head==null || head.next==null){
            return head;
        }

        //logic
        ListNode res = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return res;

    }
}
