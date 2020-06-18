// Time Complexity : O(n). n is the number of nodes in a linked list
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


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
    ListNode reverseNode;
    public ListNode reverseList(ListNode head) {
        
        if(head==null) return head;
        
        reverseNode=new ListNode();
      return  reverse(head);
    }
    
    private ListNode reverse(ListNode head){
        
        if(head==null || head.next==null) return head;
        
        reverseNode = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return reverseNode;
    }
}
