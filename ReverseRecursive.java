/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
       
      if(head == null || head.next == null) return head;
       
      ListNode r =  reverseList(head.next);
        // recursion terminated at 5 now stack pops stack has 4 on top so 4 popped
       // head = st.pop() under the hood 5 popped
        head.next.next = head; //at 4 .next.next is reversed
        head.next = null; //4.next is disconnected
 
        return r;  // recursion terminates only when stack is empty or when head or head.next is null
    }
   
}


/*
Time & Space complexity : O(n)
*/