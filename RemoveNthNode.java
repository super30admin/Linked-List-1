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

// The time complexity is same O(n) but in my bruteforce solution my space complexity is O(n) as I have used a extra space
// where is another solution using a dummy node we have a space complexity of O(1)

// Bruteforce solution : Reversing a list, removing the nth node and then reversing it back;
class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {

    if(head == null)
      return null;
    if(head.next == null && n == 1){
      return null;
    }

    ListNode reverse = head;
    ListNode prevPtr = null;
    ListNode curr = reverse;
    ListNode nextPtr = null;
    while(curr != null){
      nextPtr = curr.next;
      curr.next = prevPtr;
      prevPtr = curr;
      curr = nextPtr;
    }
    reverse = prevPtr;

    ListNode anotherCopy = reverse;
    if(n == 1){
      anotherCopy = anotherCopy.next;
      if(anotherCopy.next == null)
        return anotherCopy;
      else
        reverse = anotherCopy;
    }
    if(n > 1) {
      while(n > 2 && anotherCopy != null){
        anotherCopy = anotherCopy.next;
        n--;
      }
      anotherCopy.next = anotherCopy.next.next;
    }

    ListNode antiReverse = reverse;
    ListNode prevPtr1 = null;
    ListNode curr1 = antiReverse;
    ListNode nextPtr1 = null;
    while(curr1 != null){
      nextPtr1 = curr1.next;
      curr1.next = prevPtr1;
      prevPtr1 = curr1;
      curr1 = nextPtr1;
    }
    antiReverse = prevPtr1;

    return antiReverse;

  }
}





class Solution {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode slowPtr = dummy;
    ListNode fastPtr = dummy;
    while(n >= 0){
      fastPtr = fastPtr.next;
      n--;
    }
    while(fastPtr != null){
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next;
    }
    slowPtr.next = slowPtr.next.next;
    return dummy.next;
  }
}