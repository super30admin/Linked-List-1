// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes 1st attempt missed some pointers and was trying to return head 
// instead of prev 


// Your code here along with comments explaining your approach

// - take prev and curr pointer set prev to null and curr to head 
// - while curr not equal to null
//- take temp put curr's next in temp and  then in curr's next put prev 
// temp move prev and curr ahead

// Definition for singly-linked list.
  class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
	
    public ListNode reverseList(ListNode head) {
        return recurse(head);
    }
	 private ListNode recurse(ListNode root){
	        if(root==null || root.next==null)
	            return root;
	        
	        ListNode p=recurse(root.next);
	        root.next.next=root;
	        root.next=null;
	        return p;
	    }
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next= prev;
             prev=curr;
            curr=temp;
           
        }
        
        return prev;
    }
}