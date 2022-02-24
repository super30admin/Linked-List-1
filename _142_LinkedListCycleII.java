// space complexity - o(1)
    //time - o(n) where n is length of linked list
    //Ran on Leetcode successfully : Yes
    // Problem faced  : No
// Iterative approach : two fast and slow pointer, when fast move 2 step , slow move 1
// when slow and fast meets , it has Cycle
// now reset slow to 0 and fast to where slow and fast met, move them together 1 step each, now when both slow and fast meet, that is the point of cycle begin

public class Solution {

  public ListNode detectCycle(ListNode head) {
        ListNode hasCycleNode  = hasCycle(head);
        if(hasCycleNode == null) return null;
        return getBeginCycleNode(head, hasCycleNode);
  }

  public ListNode hasCycle(ListNode head){

    ListNode slow = head;
    ListNode fast = head;

    while(fast != null ){
      slow = slow.next;
      if(fast != null && fast.next != null){
        fast = fast.next.next;
      }
      else{
        fast = null;
      }
      if( slow == fast){
          return fast;
      }
    }
    return fast;

  }

  public ListNode getBeginCycleNode(ListNode head, ListNode hasCycleNode){

    while(head != hasCycleNode){
      head = head.next;
      hasCycleNode = hasCycleNode.next;
    }
    return head;

  }


}
