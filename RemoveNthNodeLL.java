// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//We will make reach out pointer n nodes from head, and then we will start one pointer from head and increment 
//both pointer by one, when our previous pointer reaches null then we will be at n-1 node from end 
//then we can simple delete the nth node
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
        ListNode dummy = new ListNode(-1);
        dummy.next= head;
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        
        while(n>0){
            p2 =p2.next;
            n--;
        }
        
        while(p2.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        
        p1.next = p1.next.next;
        
        return dummy.next;
    }
}
