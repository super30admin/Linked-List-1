class RemoveNthNode {
  /**
   * Remove Nth Node from the End Of a List
   * 
   * Time Complexity: O(n) Single Pass
   * Space Complexity: O(1)
   * Were you able to solved this on Leetcode: Yes
   */

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode left  = head;
    ListNode right = head;
    
    // Update right pointer so we have a difference of n between the left and right
    for(int i = 1; i <= n; i++){
        right = right.next;
    }
    
    // if the right is null, we are being asked to remove the first Node in the List.
    if(right == null) { return head.next; }
    
    // Move both pointers until right reaches the end.
    while(right != null && right.next != null){
        right = right.next;
        left = left.next;
    }
    
    // when right reaches end, we should delete the next pointer left is currently pointing to.
    left.next = left.next.next;
    return head;
  }
}