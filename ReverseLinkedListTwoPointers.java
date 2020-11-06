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
class ReverseLinkedListTwoPointers {
    public ListNode reverseList(ListNode head) {
        
/*
 * Time complexity = O(n) 
 Because we have to iterate through entire linked list once to reverse all nodes.
 * 
 * Space complexity = O(1)
 Because no extra space used. 
 
 Did this code successfully run on Leetcode : Yes

 Any problem you faced while coding this : No

Approach:
   
   2 pointers approach used where one is in cur node in given linked list and another is prev pointer pointing to one node before current node in given linked list.
  
 * 
 */
        
        ListNode prev = null;
        ListNode cur = head;
        
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;       
        }
        
        return prev;
        
    }
}
