//Time - O(N) - length of the linked list
//Space - O(1) - no additional space used

//Two Pointer (fastPtr, slowPtr) approach with one pass
//fastPtr and slowPtr will be n nodes apart
//will be iterated till the end i.e fastPtr becomes null
//then the node next to slowPtr is removed
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head == null){
      return head;
    }

    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode fastPtr = dummy;
    ListNode slowPtr = dummy;

    for(int i=0; i<=n; i++){
      fastPtr = fastPtr.next;
    }

    while(fastPtr != null){
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next;
    }

    slowPtr.next = slowPtr.next.next;
    return dummy.next;
  }
}