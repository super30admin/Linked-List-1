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
//Method 1: Iterative
// Time Complexity: O(n) : length of the list
//Space complexity: o(1)
class Solution {
    public ListNode reverseList(ListNode head) {
       if(head == null || head.next == null) return head;
       ListNode prev = null;
       ListNode current = head;
       ListNode fast = head.next;
    
        while(fast != null) {
            // ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = fast;
            fast = fast.next;
            
        }
        current.next = prev;
        return current;
            
        }
    }

//Method 2 : Recursive
// Time Complexity: O(n) : length of the list
//Space complexity: o(n) : stack space due to recursion 
/* reverseList(head.next); 
 // stack.pop() */
public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode reverse = reverseList(head.next);
   // st.pop()
    // SOP(head.val)
    head.next.next = head;
    head.next = null;
    return reverse;
}
