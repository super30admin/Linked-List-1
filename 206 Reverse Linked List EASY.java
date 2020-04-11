//206 Reverse Linked List EASY.java
//Time Complexity: O(n)
//Space Complexity: O(1)
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
        
        ListNode temp = head;
        ListNode newHead = null;
        ListNode end = null;
        while(temp != null){
            
            //iterating through the linked list
            ListNode next = temp.next;
            //check if first Node
            temp.next = end;
            end = temp;
            
            temp = next;
            
        }
        newHead = end;
        return newHead;
    }
    
}