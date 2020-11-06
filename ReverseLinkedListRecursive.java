package Nov5;

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
class ReverseLinkedListRecursive {
	
    public ListNode reverseList(ListNode head) {
        
/*
 * Time complexity = O(n) 
 Because we are processing every node exactly once.
 * 
 * Space complexity = O(1)
 Because no extra space used. 
 
 Did this code successfully run on Leetcode : Yes

 Any problem you faced while coding this : No

Approach:
 Recursive solution for reversing linked list.
  
 * 
 */
       
        // base condition for recursion
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode reversedNode = reverseList(head.next); // 5
       
      //  System.out.println(head.val); // 4 3 2 1
        head.next.next = head;
        head.next = null;
        
        return reversedNode;
       
    }
}