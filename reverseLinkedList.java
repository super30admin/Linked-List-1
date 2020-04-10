
 // Definition for singly-linked list.
 

//time complexity: O(n)
//space complexity: O(1)

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        
        while (current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;           
            current = next;  
            
        }
        return prev;
        
    }
}