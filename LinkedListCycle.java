// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class LinkedListCycle {

  public ListNode detectCycle(ListNode head) {
    if(head == null || head.next == null) { return null; }
    
    ListNode slow = head.next;
    ListNode fast = head.next.next;
    
    while(slow != fast){
        slow = slow.next;
        if(fast == null) { return null; }
        fast = fast.next;
        if(fast == null) { return null; }
        fast = fast.next;
    }
    // reset pointers
    slow = head;
    while(slow != fast){
        slow = slow.next;
        fast = fast.next;
    }
    return slow;
  }
}