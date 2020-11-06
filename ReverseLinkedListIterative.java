package Nov5;

import java.util.Stack;

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
class ReverseLinkedListIterative {
	
    public ListNode reverseList(ListNode head) {
        
/*
 * Time complexity = O(n) 
 Because we are processing every node exactly once.
 * 
 * Space complexity = O(n)
 Because stack used to save . 
 
 Did this code successfully run on Leetcode : Yes

 Any problem you faced while coding this : No

Approach:
 Iterative solution for reversing linked list.
 
 Recursion solution for reference: 
      
      // base condition for recursion
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode reversedNode = reverseList(head.next); // 5
       
      //  System.out.println(head.val); // 4 3 2 1
        head.next.next = head;
        head.next = null;
        
        return reversedNode;
  
 * 
 */
       // base condition
        if (head == null) {
            return null;
        }
        
        Stack<ListNode> st = new Stack<>();
        
        while (head.next != null) {
            st.push(head);
            head = head.next;
        } // push till second last node of given linked list
        
        // Now head is at last node, save it in a pointer to return
        ListNode reversedNode = head;
        
        // reverse node pointers while popping one node at a time from the stack 
        while (!st.isEmpty()) {
            head = st.pop();
            head.next.next = head;
            head.next = null;
        }
        
        return reversedNode;
        
    }
}