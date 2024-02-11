//Time - O(N)
//Space - O(1)
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        if(head.next==null && n==1){
            return null;
        }
        ListNode curr = head;
        int i=1;
        while(i<n){
            curr=curr.next;
            i++;
        }
        ListNode prev = null;
        ListNode curr1=head;
        while(curr.next!=null){
            prev = curr1;
            curr1 = curr1.next;
            curr=curr.next;
        }
        if(curr1==head){
            return head.next;
        }
        prev.next = curr1.next;
        return head;   
    }
}
