// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
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
       //dummy node initialize
        ListNode dummyNode = new ListNode(-1);
        //dummy node point to head
        dummyNode.next = head;
        
        //initialize p1,p2 to head
        ListNode p1 = dummyNode;
        ListNode p2 = dummyNode;
        
        //increment p2 until n reaches 0
        
        while(n > 0){
            p2 = p2.next;
            n--;
            
        }
        
        //increment p1,p2 until end or p2 reaches null
        
        while(p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        
        //remove the pointer and point to the next one
        p1.next = p1.next.next;
        //remove dummynode before returning
        return dummyNode.next;
        
    }
}