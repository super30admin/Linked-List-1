// Time Complexity : O(length of LL)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach
//to handle removing node where n=1, we add a dummy node at the start before head (else p2.next will give null pointer exception as p2 is )

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
        
        ListNode dummy= new ListNode(-1, head);
        
        ListNode p1=dummy;
        ListNode p2=dummy;
        
        while(n>0){
            p2=p2.next;
            n--;
        }
        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        
        p1.next=p1.next.next;
        
        return dummy.next;
    }
}