//recursive version
//206. Reverse Linked List EASY Recursive.java
//Time Complexity: O(n)
//Space Complexity: O(n)
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
        if(head == null)
            return null;
        return reverseList1(head,null);
        
    }
    public ListNode reverseList1(ListNode head, ListNode end){
        if(head == null)
            return end;
        ListNode next = head.next;
        head.next = end;
        end = head;
        
        return reverseList1(next,end); 
    }
}