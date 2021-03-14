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
        
        ListNode prev = null;
        
        ListNode curr = head;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
}
//Time Complexity: O(n)
// Space Complexity: O(1)

/*
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode newHead = null;
        ListNode temp = head;
        
        while(temp != null){
            ListNode node = new ListNode(temp.val);
            node.next = newHead;
            newHead = node;
            temp = temp.next;
        }
        return newHead;
    }
}
*/