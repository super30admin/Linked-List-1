// Time Complexity :O(n) n=number of elements
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
//Initialize prev pointer with null and keep track of next node. //Once next node is store, point the current node to previous node //and next to current return prev as head of reversed linked list.

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null){
            
            ListNode next=curr.next;
            curr.next=prev;
            
            prev=curr;
            curr=next;
            
        }
        return prev;
        
    }
}