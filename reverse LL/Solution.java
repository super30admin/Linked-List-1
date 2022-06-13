// Time Complexity: O(n)
// Space Comlpexity: O(1)
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
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode next = head.next;
        while(curr != null && curr.next!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        // curr.next=prev;
       curr.next=prev;
            prev=curr;
        return prev;
    }
}
