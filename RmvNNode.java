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
//TimeComplexity: O(N) N: no. of nodes
// Space Complexity: O(1);
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp= new ListNode(-1);
        ListNode t2= temp;
        temp.next=head;
        ListNode t= head;
        for(int i=0;i<n;i++){
            t=t.next;
        }
        while(t!=null){
            t=t.next;
            t2=t2.next;
        }
        t2.next= t2.next.next;
        return temp.next;
    }
}