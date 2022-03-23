// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class RemoveNthNode {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode left  = head;
    ListNode right = head;
    
    for(int i = 1; i <= n; i++){
        right = right.next;
    }
    
    if(right == null) { return head.next; }
    
      while(right != null && right.next != null){
        right = right.next;
        left = left.next;
    }
    left.next = left.next.next;
    return head;
  }
}