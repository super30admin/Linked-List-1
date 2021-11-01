// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

public class ReverseLinkedList {
  public ListNode reverseList(ListNode head) {
        if(head==null) return head;
       return helper(head);
    }
    
    public ListNode helper(ListNode curr){
        if(curr.next==null){
            return curr;
        }
        
        ListNode temp=helper(curr.next);
        curr.next.next=curr;
        curr.next=null;
        return temp;
    }
    
    public class ListNode {
    	      int val;
    	      ListNode next;
    	      ListNode() {}
    	      ListNode(int val) { this.val = val; }
    	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
